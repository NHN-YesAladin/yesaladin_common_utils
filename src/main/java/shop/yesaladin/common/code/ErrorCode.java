package shop.yesaladin.common.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
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
    PRODUCT_NEGATIVE_OR_ZERO_QUANTITY("음수 혹은 0인 수량이 입력되었습니다.", HttpStatus.BAD_REQUEST),
    PAYMENT_FAIL("결제에 실패 하였습니다.", HttpStatus.BAD_REQUEST),
    ADDRESS_REGISTERED_UP_TO_LIMIT("최대 10개까지 등록 가능합니다.", HttpStatus.BAD_REQUEST),
    POINT_OVER_USE("포인트가 부족합니다.", HttpStatus.BAD_REQUEST),
    POINT_INVALID_PARAMETER("잘못된 파라미터입니다.", HttpStatus.BAD_REQUEST),
    PUBLISH_PUBLISHER_NOT_FOUND("출판사가 이미 존재합니다.", HttpStatus.CONFLICT),
    PRODUCT_ALREADY_EXIST("상품이 이미 존재합니다.", HttpStatus.CONFLICT),
    PUBLISH_ALREADY_EXIST("출판사와 상품의 출판 관계가 이미 존재합니다.", HttpStatus.CONFLICT),
    TAG_ALREADY_EXIST("태그가 이미 존재합니다.", HttpStatus.CONFLICT),
    PRODUCT_ALREADY_DELETED("상품이 이미 삭제되었습니다.", HttpStatus.CONFLICT),
    CATEGORY_ALREADY_DELETED("카테고리가 이미 삭제되었습니다.", HttpStatus.CONFLICT),
    MEMBER_ALREADY_BLOCKED("이미 차단된 회원입니다.", HttpStatus.CONFLICT),
    MEMBER_ALREADY_UNBLOCKED("이미 차단 해지된 회원입니다.", HttpStatus.CONFLICT),
    ADDRESS_ALREADY_DELETED("이미 삭제된 배송지 입니다.", HttpStatus.CONFLICT);
    private final String displayName;
    private final HttpStatus responseStatus;
}
