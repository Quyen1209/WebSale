package com.vti.form;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderFilterForm {
    private String search;
    private Integer accountId;
    private Integer productId;
}
