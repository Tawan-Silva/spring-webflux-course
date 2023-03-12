package br.com.tawandev.webfluxcourse.service.exception;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String message) {
        super(message);
    }
}
