package shop.yesaladin.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import shop.yesaladin.common.code.ErrorCode;

@Getter
public class ServerException extends RuntimeException {

    private final ErrorCode errorCode;
    private final HttpStatus responseStatus;
    private final String displayErrorMessage;

    public ServerException(ErrorCode errorCode, String messageForLog) {
        this(errorCode, errorCode.getDisplayName(), messageForLog);
    }

    public ServerException(ErrorCode errorCode, String displayErrorMessage, String messageForLog) {
        super(messageForLog);
        this.errorCode = errorCode;
        this.responseStatus = errorCode.getResponseStatus();
        this.displayErrorMessage = displayErrorMessage;
    }

    public String getDisplayErrorMessage() {
        return this.displayErrorMessage;
    }
}
