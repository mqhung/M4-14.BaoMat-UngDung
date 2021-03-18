package com.codegym.baomat.repo;

import com.codegym.baomat.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser getAppUsersByName(String name);
}
