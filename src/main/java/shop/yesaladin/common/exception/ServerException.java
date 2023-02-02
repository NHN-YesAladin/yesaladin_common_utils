package shop.yesaladin.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import shop.yesaladin.common.code.ErrorCode;

@Getter
public class ServerException extends RuntimeException {

    private final ErrorCode errorCode;
    private final HttpStatus responseStatus;

    public ServerException(ErrorCode errorCode, String messageForLog) {
        super(messageForLog);
        this.errorCode = errorCode;
        this.responseStatus = errorCode.getResponseStatus();
    }

    public String getDisplayErrorMessage() {
        return errorCode.getDisplayName();
    }
}
