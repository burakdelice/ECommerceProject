package com.bilgeadam.exception;

import lombok.Getter;

@Getter
public class CartManagerException extends RuntimeException {

    private final ErrorType errorType;

    public CartManagerException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public CartManagerException(ErrorType errorType, String customMessage){
        super(customMessage);
        this.errorType=errorType;
    }

}
