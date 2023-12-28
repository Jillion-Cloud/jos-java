package cloud.jillion.jos.client.core;

/**
 * @author leanderlee
 * @since 1.0.0
 */
public class JOSClientException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String errCode;

    public JOSClientException(String errMessage) {
        super(errMessage);
    }

    public JOSClientException(String errCode, String errMessage) {
        super(errMessage);
        this.errCode = errCode;
    }

    public JOSClientException(String errMessage, Throwable e) {
        super(errMessage, e);
    }

    public JOSClientException(String errCode, String errMessage, Throwable e) {
        super(errMessage, e);
        this.errCode = errCode;
    }

    public String getErrCode() {
        return this.errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }
}
