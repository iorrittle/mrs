package mrs.app.reservation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.*;

import javax.persistence.PostLoad;
import javax.validation.*;

@Documented
@Constraint(validatedBy = { EndTimeMustBeAfterStartTimeValidator.class})
@Target({ TYPE, ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface EndTimeMustBeAfterStartTime {

	String message() default "{mrs.app.reservation.EndTimeMustBeAfterStartTime.message}";
	
	Class<?>[]groups() default {};
	
	Class<? extends PostLoad>[]payload() default {};
	
	@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
	@ReTention(RUNTIME)
	@Documented
	public @interface List {
		EndTimeMustBeAfterStartTime[]value();
	}

}
