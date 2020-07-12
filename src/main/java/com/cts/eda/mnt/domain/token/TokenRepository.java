package com.cts.eda.mnt.domain.token;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Optional;

public interface TokenRepository {
    Optional<Token> findById(@NotNull Long id);

    Token save(@NotBlank String name);

    void deleteById(@NotNull Long id);

    int update(@NotNull Long id, @NotBlank String name);
}
