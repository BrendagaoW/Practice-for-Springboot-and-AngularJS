package ErrorMessage.Exception;

public class BusinessException extends RuntimeException {
    public BusinessException(String code, String service) {
        super(code, new Exception(service));
    }
}
