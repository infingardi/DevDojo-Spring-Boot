package academy.devdojo.springboot2.configurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class DevDojoMvcConfigurer implements WebMvcConfigurer {

    // Sobrepondo configuração global de pages (5 elementos por página)
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolver) {
        PageableHandlerMethodArgumentResolver pageHandler = new  PageableHandlerMethodArgumentResolver();
        pageHandler.setFallbackPageable(PageRequest.of(0, 5));

        resolver.add(pageHandler);
    }
}
