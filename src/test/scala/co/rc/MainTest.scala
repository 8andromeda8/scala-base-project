package co.rc

import org.specs2.mutable.Specification

class MainTest() extends Specification {

  "Main test specification" >> {

    "Method hello should return 'hello user'" >> {
      Main.hello( "user" ) must_== "Hello user"
    }

  }

}