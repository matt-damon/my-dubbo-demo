package com.damon.service.impl;

import com.damon.api.SiteService;

public class SiteServiceImpl implements SiteService {

    @Override
    public String getName(String name) {
        return "hello," + name;
    }
}
