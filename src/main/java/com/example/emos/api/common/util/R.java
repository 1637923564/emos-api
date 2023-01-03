package com.example.emos.api.common.util;

import lombok.Data;
import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

@Data
public class R<D> {
    private final int code;
    private final D data;
    private final String msg;

    private R(int code, D data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static <D> R<D> success(D data) {
        return new R<>(HttpStatus.SC_OK, data, "success");
    }

    public static R<Object> faild(int code, String msg) {
        return new R<>(code, null, msg);
    }

    @Override
    public String toString() {
        return "R{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}