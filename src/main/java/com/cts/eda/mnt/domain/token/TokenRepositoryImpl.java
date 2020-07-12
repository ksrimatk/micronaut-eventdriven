package com.cts.eda.mnt.domain.token;

import javax.inject.Singleton;
import javax.persistence.*;
import javax.transaction.Transactional;
import io.micronaut.transaction.annotation.ReadOnly;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Optional;
import com.cts.eda.mnt.domain.token.Token;
import com.cts.eda.mnt.domain.token.TokenRepository;

@Singleton
public class TokenRepositoryImpl implements TokenRepository {
    private final EntityManager entityManager;

    public TokenRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    @ReadOnly
    public Optional<Token> findById(@NotNull Long id) {
        return Optional.ofNullable(entityManager.find(Token.class, id));
    }

    @Override
    @Transactional
    public Token save(@NotBlank String name) {
        return null;
    }

    @Override
    @Transactional
    public void deleteById(@NotNull Long id) {

    }

    @Override
    @Transactional
    public int update(@NotNull Long id, @NotBlank String name) {
        return 0;
    }
}
