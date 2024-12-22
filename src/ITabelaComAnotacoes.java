import java.lang.annotation.*;

/**
 * @author Filipe Queiroz
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface ITabelaComAnotacoes {

    String value() default "ITabelaComAnotacoes";
}