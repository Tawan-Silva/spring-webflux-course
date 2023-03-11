package br.com.tawandev.webfluxcourse.repository;

import br.com.tawandev.webfluxcourse.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Repository
public class UserRepository {

    private final ReactiveMongoTemplate mongoTemplate;

    public Mono<User> save(final User user) {
        return mongoTemplate.save(user);
    }
}
