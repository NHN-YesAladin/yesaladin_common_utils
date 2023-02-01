package shop.yesaladin.common.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    NOT_FOUND("요청 객체를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    FILE_NOT_FOUND("파일을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    PRODUCT_NOT_FOUND("상품을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    PRODUCT_SAVING_METHOD_CODE_NOT_FOUND("상품 포인트 적립 방식 코드를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    PRODUCT_TYPE_CODE_NOT_FOUND("상품 유형 코드를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    PRODUCT_SUBSCRIBE_NOT_FOUND("구독상품을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    PRODUCT_TOTAL_DISCOUNT_RATE_NOT_EXIST("전체 할인율을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    PUBLISH_NOT_FOUND("출판사와 상품의 출판 관계를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    TAG_NOT_FOUND("태그를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    WRITING_AUTHOR_NOT_FOUND("저자를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    WRITING_NOT_FOUND("저자와 상품의 집필 관계를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    CATEGORY_NOT_FOUND("상품카테고리를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    ORDER_NOT_FOUND("주문을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    PAYMENT_NOT_FOUND("결제를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    ADDRESS_NOT_FOUND("존재하지 않는 배송지 입니다.", HttpStatus.NOT_FOUND),
    PRODUCT_RELATION_NOT_FOUND("상품 연관관계를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    COUPON_NOT_FOUND("쿠폰이 존재하지 않습니다.", HttpStatus.NOT_FOUND),
    TRIGGER_COUPON_NOT_FOUND("트리거 쿠폰이 존재하지 않습니다.", HttpStatus.NOT_FOUND),
    MEMBER_NOT_FOUND("회원을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    MEMBER_ROLE_NOT_FOUND("해당 회원의 권한을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    MEMBER_GRADE_NOT_FOUND("해당 등급을 조회할 수 없습니다.", HttpStatus.NOT_FOUND),
    BAD_REQUEST("해당 요청은 처리가 불가합니다.", HttpStatus.BAD_REQUEST),
    PRODUCT_SELF_RELATE("동일한 상품은 연관관계를 맺을 수 없습니다.", HttpStatus.BAD_REQUEST),
    INVALID_COUPON_DATA("유효하지 않는 쿠폰 데이터입니다.", HttpStatus.BAD_REQUEST),
    INVALID_OFFSET("페이지 위치는 1부터 시작입니다.", HttpStatus.BAD_REQUEST),
    INVALID_SIZE("갯수는 1개부터 최대 20개까지입니다.", HttpStatus.BAD_REQUEST),
    PRODUCT_NEGATIVE_OR_ZERO_QUANTITY("음수 혹은 0인 수량이 입력되었습니다.", HttpStatus.BAD_REQUEST),
    PAYMENT_FAIL("결제에 실패 하였습니다.", HttpStatus.BAD_REQUEST),
    ADDRESS_REGISTERED_UP_TO_LIMIT("최대 10개까지 등록 가능합니다.", HttpStatus.BAD_REQUEST),
    POINT_OVER_USE("포인트가 부족합니다.", HttpStatus.BAD_REQUEST),
    POINT_INVALID_PARAMETER("잘못된 포인트내역 요청입니다.", HttpStatus.BAD_REQUEST),
    ORDER_INVALID_PARAMETER("잘못된 주문 요청입니다.", HttpStatus.BAD_REQUEST),
    ALREADY_DELETED("요청 객체가 이미 삭제 되었습니다.", HttpStatus.CONFLICT),
    PUBLISH_PUBLISHER_NOT_FOUND("출판사가 이미 존재합니다.", HttpStatus.CONFLICT),
    PRODUCT_ALREADY_EXIST("상품이 이미 존재합니다.", HttpStatus.CONFLICT),
    PUBLISH_ALREADY_EXIST("출판사와 상품의 출판 관계가 이미 존재합니다.", HttpStatus.CONFLICT),
    TAG_ALREADY_EXIST("태그가 이미 존재합니다.", HttpStatus.CONFLICT),
    PRODUCT_ALREADY_DELETED("상품이 이미 삭제되었습니다.", HttpStatus.CONFLICT),
    CATEGORY_ALREADY_DELETED("카테고리가 이미 삭제되었습니다.", HttpStatus.CONFLICT),
    MEMBER_ALREADY_BLOCKED("이미 차단된 회원입니다.", HttpStatus.CONFLICT),
    MEMBER_ALREADY_UNBLOCKED("이미 차단 해지된 회원입니다.", HttpStatus.CONFLICT),
    ADDRESS_ALREADY_DELETED("이미 삭제된 배송지 입니다.", HttpStatus.CONFLICT),
    PRODUCT_RELATION_ALREADY_EXIST("상품 연관관계가 이미 존재합니다.", HttpStatus.CONFLICT),
    MEMBER_ID_ALREADY_EXIST("해당 ID는 이미 사용중입니다.", HttpStatus.CONFLICT),
    MEMBER_PHONE_ALREADY_EXIST("해당 전화번호로 등록된 계정이 존재합니다.", HttpStatus.CONFLICT),
    MEMBER_NICKNAME_ALREADY_EXIST("해당 닉네임은 이미 사용중입니다.", HttpStatus.CONFLICT),
    MEMBER_EMAIL_ALREADY_EXIST("해당 이메일로 등록된 계정이 존재합니다.", HttpStatus.CONFLICT),
    UNAUTHORIZED("해당 요청은 인증이 필요합니다.", HttpStatus.UNAUTHORIZED),
    FORBIDDEN("해당 요청은 접근이 불가합니다.", HttpStatus.FORBIDDEN),
    METHOD_NOT_ALLOWED("해당 요청을 서버에서 처리할 수 없습니다.", HttpStatus.METHOD_NOT_ALLOWED),
    ;
    private final String displayName;
    private final HttpStatus responseStatus;
}
