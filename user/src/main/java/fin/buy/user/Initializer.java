package fin.buy.user;

import fin.buy.user.config.RedisConfig;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

public class Initializer extends AbstractHttpSessionApplicationInitializer {
    public Initializer() {
        super(RedisConfig.class);
    }
}
