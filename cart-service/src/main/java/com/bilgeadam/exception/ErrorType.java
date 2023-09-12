package com.bilgeadam.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorType {

    INTERNAL_ERROR_SERVER(5500,"Sunucu Hatası",HttpStatus.INTERNAL_SERVER_ERROR),
    BAD_REQUEST(4500,"Parametre hatası",HttpStatus.BAD_REQUEST),
    CART_NOT_FOUND(4510, "Böyle bir kart bulunamadı",HttpStatus.NOT_FOUND),
    INVALID_CODE(4511, "Geçersiz Kod",HttpStatus.BAD_REQUEST),
    UNEXPECTED_ERROR(4512,"Beklenmeyen bir hata olustu",HttpStatus.BAD_REQUEST),
    DATA_INTEGRITY(4513, "hatalı veri",HttpStatus.BAD_REQUEST),
    CART_NOT_CREATED(4514, "Kart oluşturulamadı",HttpStatus.BAD_REQUEST),

    ;


    private int code;
    private String message;
    HttpStatus httpStatus;


}
