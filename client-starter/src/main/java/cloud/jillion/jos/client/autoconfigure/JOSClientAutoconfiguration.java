package cloud.jillion.jos.client.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import cloud.jillion.jos.client.core.JOSClient;
import cloud.jillion.jos.client.core.JOSClientBuilder;

/**
 * @author leanderlee
 * @since 1.0.0
 */
@Configuration
@EnableConfigurationProperties(JOSClientProperties.class)
@ConditionalOnClass(JOSClient.class)
public class JOSClientAutoconfiguration {

    final private JOSClientProperties properties;

    public JOSClientAutoconfiguration(JOSClientProperties properties) {
        this.properties = properties;
    }

    @Bean
    public JOSClient fosClient() {
        JOSClientBuilder JOSClientBuilder = new JOSClientBuilder();
        JOSClientBuilder.setServerUrl(properties.getServerUrl());
        JOSClientBuilder.setAccessKey(properties.getAccessKey());
        JOSClientBuilder.setAccessSecret(properties.getAccessSecret());
        JOSClientBuilder.setConnectionTimeout(properties.getConnectionTimeout());
        JOSClientBuilder.setLogEnabled(properties.getLogEnabled());
        return JOSClientBuilder.build();
    }
}
