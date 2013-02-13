package sample.component

import org.springframework.stereotype.Component

/**
 * User: Michael.Patel
 * Date: 13/02/13
 * Time: 12:10
 * 
 */
@Component("scalaComponent")
class ScalaComponent {


      def scalaJoinsTheParty(s:String) = {
          println("Scala acts on "+s)
      }
}
