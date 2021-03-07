package com.enn.common;

import lombok.Data;

@Data
public class ApiResultDto<T> {
    private Integer code;
    private String message;
    private T data;

    public ApiResultDto() {
        this.code = ResultCodeEnum.SUCCESS.getCode();
        this.message = ResultCodeEnum.SUCCESS.getMessage();
    }


    public ApiResultDto(T data) {
        this.code = ResultCodeEnum.SUCCESS.getCode();
        this.message = ResultCodeEnum.SUCCESS.getMessage();
        this.data = data;
    }

    public ApiResultDto(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ApiResultDto(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ApiResultDto(ResultCodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
    }
}
