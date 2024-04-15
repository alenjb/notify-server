package com.example.notifyserver.common.exception.model;

import com.example.notifyserver.common.exception.enums.ErrorCode;

public class UnAuthorizedException extends NotifyException{

    public UnAuthorizedException(ErrorCode errorCode) {
        super(errorCode);
    }
}
