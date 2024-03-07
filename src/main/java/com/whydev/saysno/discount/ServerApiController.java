package com.whydev.saysno.discount;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/server")
public class ServerApiController {

    //클라이언트가 되는 서버에서 요청이 여기로 들어옴
    @GetMapping("/discount")
    public DiscountDTO discount(DiscountDTO discountDTO){
        //Client에서 Response Entity 로 받고 있기 떄문에
        log.info("discountDTO:{}",discountDTO.toString());
        return discountDTO;
    }


}