package uk.ac.shu.ima.events

class Region {

  String regionName

  static constraints = {
    regionName(nullable:false, blank:false)
  }
}
