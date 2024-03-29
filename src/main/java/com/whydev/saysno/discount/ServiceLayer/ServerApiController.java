package com.whydev.saysno.discount.ServiceLayer;

import com.whydev.saysno.discount.DataAccessLayer.DiscountDTO;
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
        log.info("discountDTO:{}",discountDTO.toString());
        return discountDTO;
    }
}