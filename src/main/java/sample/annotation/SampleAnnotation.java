package sample.annotation;

import java.lang.annotation.*;

/**
 * User: Michael.Patel
 * Date: 13/02/13
 * Time: 11:58
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SampleAnnotation {
}
