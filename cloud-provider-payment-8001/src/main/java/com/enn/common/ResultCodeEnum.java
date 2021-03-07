package com.enn.common;

import lombok.Getter;

public enum ResultCodeEnum {
    SUCCESS(200, "成功"),
    FAILED(400, "失败"),

    ;
    @Getter
    private Integer code;
    @Getter
    private String message;


    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
