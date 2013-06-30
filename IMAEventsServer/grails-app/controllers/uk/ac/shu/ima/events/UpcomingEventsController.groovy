package uk.ac.shu.ima.events

import grails.converters.*

class UpcomingEventsController {

  def list() {
    // List all events in region params.id since params.addedSince
    def result = [:]

    def region = Region.findByRegionName(params.id)

    if ( region != null ) {
      def added_since_timestamp = new Date(Long.parseLong(params.addedSince))
      result.events = Event.findAllByRegionAndDateAddedGreaterThan(region, added_since_timestamp)
    }

    render result as JSON
  }
}
