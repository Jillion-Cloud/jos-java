package cloud.jillion.jos.client.core;

import lombok.Getter;

/**
 * @author leanderlee
 * @since 1.0.0
 */
@Getter
public class JOSClientBuilder {

    private String serverUrl;

    private String accessKey;

    private String accessSecret;

    private Integer connectionTimeout = 10;

    private Boolean logEnabled = true;

    public JOSClientBuilder setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }

    public JOSClientBuilder setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public JOSClientBuilder setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }

    public JOSClientBuilder setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
        return this;
    }

    public JOSClientBuilder setLogEnabled(Boolean logEnabled) {
        this.logEnabled = logEnabled;
        return this;
    }

    public JOSClient build() {
        return new JOSClient(this);
    }


}
