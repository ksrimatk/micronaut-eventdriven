package com.cts.eda.mnt.domain.token;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface TokenRepository extends CrudRepository<Token, Long> {
}
