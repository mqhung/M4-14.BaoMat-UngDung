package com.codegym.baomat.service;

import com.codegym.baomat.model.AppUser;

public interface IAppUserService {
    AppUser getUserByName(String name);
}
