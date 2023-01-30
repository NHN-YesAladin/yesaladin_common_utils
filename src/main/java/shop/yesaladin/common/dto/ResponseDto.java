package shop.yesaladin.common.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * 콩통 응답용 Dto 클래스입니다.
 *
 * @param <T> 응답 데이터 타입
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto<T> {

    private boolean success;
    @JsonIgnore
    private HttpStatus status;
    private T data;
    private List<String> errorMessages;

    public static <T> ResponseDtoBuilder<T> builder() {
        return new ResponseDtoBuilder<T>();
    }

    @JsonGetter
    public int getStatus() {
        return this.status.value();
    }


    public static class ResponseDtoBuilder<T> {

        private boolean success;
        private HttpStatus status;
        private T data;
        private List<String> errorMessages;

        ResponseDtoBuilder() {
        }

        public ResponseDtoBuilder<T> success(boolean success) {
            this.success = success;
            return this;
        }

        public ResponseDtoBuilder<T> status(HttpStatus status) {
            this.status = status;
            return this;
        }

        public ResponseDtoBuilder<T> data(T data) {
            this.data = data;
            return this;
        }

        public ResponseDtoBuilder<T> errorMessages(List<String> errorMessages) {
            this.errorMessages = errorMessages;
            return this;
        }

        public ResponseDto<T> build() {
            return new ResponseDto<T>(success, status, data, errorMessages);
        }

        public String toString() {
            return "ResponseDto.ResponseDtoBuilder(success=" + this.success + ", status="
                    + this.status
                    + ", data=" + this.data + ", errorMessages=" + this.errorMessages + ")";
        }
    }
}
