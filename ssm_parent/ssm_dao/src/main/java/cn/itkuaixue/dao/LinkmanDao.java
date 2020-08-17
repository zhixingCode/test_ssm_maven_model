package cn.itkuaixue.dao;

import cn.itkuaixue.pojo.Linkman;

import java.util.List;

/**
 * @Author:libingcheng
 * @Data:2020/8/17 1:59 下午
 */
public interface LinkmanDao {
    /**
     * 查询所有联系人
     * @return
     */
    List<Linkman> findAll();
}
