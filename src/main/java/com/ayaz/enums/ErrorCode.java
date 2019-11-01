package com.ayaz.enums;

public enum ErrorCode {

    NUMBER_FORMAT_EXCEPTION(501),
    METHOD_ARGUMENT_NOT_VALID_EXCEPTION(400),
    VALIDATION_EXCEPTION(500),
    HTTP_REQUEST_METHOD_NOT_SUPPORTA_EXCEPTION(405),
    NO_SUCH_ELEMENT_EXCEPTION(500),
    HTTP_MEDIA_TYPE_NOT_SUPPORTED_EXCEPTION(415),
    CONSTRAINT_VIOLATION_EXCEPTION(500);

    private int code;
    private ErrorCode(int code){
        this.code=code;
    }
    public int getCode() {
        return code;
    }

}
