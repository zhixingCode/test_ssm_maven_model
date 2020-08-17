package cn.itkuaixue.service;

import cn.itkuaixue.pojo.Linkman;

import java.util.List;

/**
 * @Author:libingcheng
 * @Data:2020/8/17 2:14 下午
 */
public interface LinkmanService {
    /**
     * 查询所有联系人
     * @return
     */
    List<Linkman> findAll();
}
