import java.lang.annotation.*;

/**
 * @author Filipe Queiroz
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ITabela {
    String nome();
}