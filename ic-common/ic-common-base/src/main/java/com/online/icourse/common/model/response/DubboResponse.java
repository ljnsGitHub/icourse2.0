package com.online.icourse.common.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @ClassName DubboResponse
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/10/2 0002
 * @Version V1.0
 **/
@NoArgsConstructor
@Getter
public class DubboResponse<T> implements Response{
    private ResultCode resultCode;
    private T data;
    private boolean success = SUCCESS;

    public DubboResponse(ResultCode resultCode, boolean success) {
        this.resultCode = resultCode;
        this.data = data;
        this.success = success;
    }

    public DubboResponse(T data, ResultCode resultCode,boolean success) {
        this.data = data;
        this.success = success;
        this.resultCode = resultCode;
    }

    public static <T> DubboResponse<T> SUCCESS(T data){
        return new DubboResponse(data,CommonCode.SUCCESS,SUCCESS);
    }

    public static <T> DubboResponse<T> SUCCESS(ResultCode resultCode){
        return new DubboResponse(resultCode,SUCCESS);
    }

    public static <T> DubboResponse<T> FAIL(ResultCode resultCode){
        return new DubboResponse(resultCode,FAIL);
    }

    public static <T> DubboResponse<T> FAIL(T data,ResultCode resultCode){
        return new DubboResponse(data,resultCode,FAIL);
    }

}
