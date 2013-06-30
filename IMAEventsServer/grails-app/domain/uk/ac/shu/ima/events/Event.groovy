package uk.ac.shu.ima.events

class Event {

  String eventName
  Date dateAdded = new Date // Default to Now
  Date eventDate
  String eventAddress
  Region region

  // Specify some mappings that influence the default generated column and table names
  static mapping = {
    // Specify some custom names for the DB columns
    id column:'event_id' // All classes get an ID primary key
    dateAdded column:'event_date_added' // Date the event was added to the DB
    eventDate column:'event_date' // Date of the event
    // Other DB columns are defaulted based on prop names
  }

  // Database and validation constraints
  static constraints = {
    eventName(nullable:false, blank:false)
    dateAdded(nullable:false, blank:false)
    eventDate(nullable:false, blank:false)
    eventAddress(nullable:false, blank:false)
  }
}
