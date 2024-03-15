package com.whydev.saysno.discount.ServiceLayer;

import com.whydev.saysno.discount.DataAccessLayer.DiscountDTO;
import com.whydev.saysno.discount.PresentationLayer.DiscountRequest;
import com.whydev.saysno.discount.ServiceLayer.DiscountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ApiController {

    private final DiscountService discountService;

    public ApiController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @GetMapping("/discount")
    public DiscountDTO getDiscountInfo(DiscountRequest discountRequest) {
        DiscountDTO discountDTO = new DiscountDTO();
        return discountService.discount(discountDTO);
    }
}
