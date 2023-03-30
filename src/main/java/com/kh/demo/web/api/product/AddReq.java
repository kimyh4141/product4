package com.kh.demo.web.api.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddReq {
  @NotBlank
  private String pname;   //상품명
  @NotNull
  //@Positive(message = "단가는 양수값이어야 합니다.")
  private Long quantity;  //수량
  @NotNull
  //@Positive(message = "단가는 양수값이어야 합니다.")
  private Long price;     //단가
}