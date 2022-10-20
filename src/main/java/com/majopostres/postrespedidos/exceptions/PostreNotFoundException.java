package com.majopostres.postrespedidos.exceptions;

public class PostreNotFoundException extends RuntimeException {
    public PostreNotFoundException(String s) {
        super(s);
    }
}
