package de.dcnis.dubbo.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "de.dcnis.dubbo.provider")
@PropertySource("classpath:/dubbo/provider.properties")
public class ProviderConfiguration {
}
