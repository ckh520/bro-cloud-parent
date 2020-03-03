package bro.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:ItemController
 * @Description:TODO
 * @Author:admin
 * @Date:2020/2/23 23:39
 * @Version:V1.0
 */

@RequestMapping("/provider/item")
@RestController
public class ItemController {
    @GetMapping("/{id}")
    public String getItem(@PathVariable("id") Integer id) {
        return "生产第" + id + "商品:8082";

    }
}
