package com.whydev.saysno.discount;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DiscountRequest {


    private final DiscountService discountService;

    public DiscountRequest(DiscountService discountService) {
        this.discountService = discountService;
    }

    @GetMapping("/discount") // 클라이언트가 되는 서버에서 요청이 들어오는 곳
    public ResponseEntity<String> getDiscount() {
        // DiscountDTO discountDto = ...; // DiscountDTO 객체를 생성 또는 얻어오는 코드가 필요함
        DiscountDTO discountDto = new DiscountDTO(); // 예시로 빈 객체를 생성

//        String discountInfo = discountService.discount(discountDto);
//        return ResponseEntity.ok(discountInfo);
        return pass;

//        String data = DiscountService.discount(DiscountDTO discountDto);
//        return ResponseEntity.ok(discountInfo);
    }

}
