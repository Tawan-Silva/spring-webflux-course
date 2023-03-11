package br.com.tawandev.webfluxcourse.controller.impl;

import br.com.tawandev.webfluxcourse.controller.UserController;
import br.com.tawandev.webfluxcourse.model.request.UserRequest;
import br.com.tawandev.webfluxcourse.model.response.UserResponse;
import br.com.tawandev.webfluxcourse.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/users")
public class UserControllerImpl implements UserController {

    private final UserService service;

    @Override
    public ResponseEntity<Mono<Void>> save(UserRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.save(request).then());
    }

    @Override
    public ResponseEntity<Mono<UserResponse>> find(String id) {
        return null;
    }

    @Override
    public ResponseEntity<Flux<UserResponse>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Mono<UserResponse>> update(String id, UserRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<Mono<Void>> delete(String id) {
        return null;
    }
}
