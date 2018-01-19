package com.mobile.cms.ysappandroid.http;

/**
 */
public class JSONResult<T> {
    public int code;
    public String message;
    public String error;
    public T data;
}
