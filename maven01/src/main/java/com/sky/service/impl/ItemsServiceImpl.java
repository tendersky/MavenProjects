package com.sky.service.impl;

import com.sky.dao.ItemsDao;
import com.sky.domain.Items;
import com.sky.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public Items findById(Integer id) {
       return itemsDao.findById(id);
    }
}
