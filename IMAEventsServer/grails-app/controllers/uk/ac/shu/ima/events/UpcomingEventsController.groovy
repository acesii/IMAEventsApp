package uk.ac.shu.ima.events

import grails.converters.*

class UpcomingEventsController {

  def list() {

    log.debug(params);

    // Top level JSON response object
    def result = [:]

    // List all events in region params.id since params.addedSince
    result.events = []

    def region = Region.findByRegionName(params.id)

    if ( region != null ) {
      def added_since_timestamp = new Date(Long.parseLong(params.addedSince))
      Event.findAllByRegionAndDateAddedGreaterThan(region, added_since_timestamp).each { event ->
        result.events.add([
                           name:event.eventName,
                           dateAdded:event.dateAdded.getTime(), 
                           eventDate:event.eventDate, 
                           address:event.eventAddress, 
                           region:event.region.regionName])
      }
    }

    // Implement JSONP Callback
    if ( params.callback ) {
      render "${params.callback}(${result as JSON})"
    } else {
      render result as JSON
    }
  }
}
