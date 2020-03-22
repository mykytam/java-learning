import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // only for methods
@Retention(RetentionPolicy.RUNTIME) // compilation type
public @interface MethodInfo {
    String author() default "Mykyta";
    int dateOfCreation() default 2020;
    String purpose();
}
