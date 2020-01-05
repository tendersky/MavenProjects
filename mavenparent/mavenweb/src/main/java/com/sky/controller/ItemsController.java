package com.sky.controller;


import com.sky.service.ItemsService;
import com.sky.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/findDetails")
    public String findById(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
