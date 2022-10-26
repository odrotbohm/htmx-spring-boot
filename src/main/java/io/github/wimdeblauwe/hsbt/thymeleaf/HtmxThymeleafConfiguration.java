package io.github.wimdeblauwe.hsbt.thymeleaf;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
public class HtmxThymeleafConfiguration {
    @Bean
    public HtmxDialect htmxDialect(ObjectMapper mapper) {
        return new HtmxDialect(mapper);
    }
}
