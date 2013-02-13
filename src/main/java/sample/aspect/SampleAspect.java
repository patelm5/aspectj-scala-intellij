package sample.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import sample.annotation.SampleAnnotation;
import sample.component.SampleComponent;
import sample.component.ScalaComponent;

/**
 * User: Michael.Patel
 * Date: 13/02/13
 * Time: 11:55
 */
@Aspect
public class SampleAspect {

    public void setComponent(ScalaComponent component) {
        this.component = component;
    }

    @Autowired
    private ScalaComponent component ;

    @Around(value = "execution(@sample.annotation.SampleAnnotation * *(..)) && @annotation(sampleAnnotation)", argNames = "sampleAnnotation")
    public Object intercept(ProceedingJoinPoint joinPoint, SampleAnnotation sampleAnnotation) throws Throwable {

            component.scalaJoinsTheParty((String) joinPoint.getArgs()[0]);
            return joinPoint.proceed();

    }

}