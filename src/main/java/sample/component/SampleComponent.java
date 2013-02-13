package sample.component;

import org.springframework.stereotype.Component;
import sample.annotation.SampleAnnotation;

/**
 * User: Michael.Patel
 * Date: 13/02/13
 * Time: 11:59
 */
@Component("sampleComponent")
public class SampleComponent {

      @SampleAnnotation
      public String interceptMe(String input){
                   return "has been input "+ input ;
      }

}
