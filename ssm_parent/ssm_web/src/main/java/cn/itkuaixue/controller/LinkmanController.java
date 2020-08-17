package cn.itkuaixue.controller;

import cn.itkuaixue.entry.Result;
import cn.itkuaixue.pojo.Linkman;
import cn.itkuaixue.service.LinkmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:libingcheng
 * @Data:2020/8/17 2:27 下午
 */
@RestController
@RequestMapping("/linkman")
public class LinkmanController {
    @Autowired
    private LinkmanService linkmanService;

    /**
     * 查询所有联系人
     * @return
     */
    @GetMapping("/findAll")
    public Result findAll(){
        try {
            List<Linkman> linkmanList = linkmanService.findAll();
            return new Result(true, "查询成功",linkmanList);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "查询失败");
        }
    }

}
