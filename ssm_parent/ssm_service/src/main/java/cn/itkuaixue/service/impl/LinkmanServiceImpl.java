package cn.itkuaixue.service.impl;

import cn.itkuaixue.dao.LinkmanDao;
import cn.itkuaixue.pojo.Linkman;
import cn.itkuaixue.service.LinkmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:libingcheng
 * @Data:2020/8/17 2:29 下午
 */
@Service
public class LinkmanServiceImpl implements LinkmanService {
    @Autowired
    private LinkmanDao linkmanDao;

    /**
     * 查询所有联系人
     * @return
     */
    @Override
    public List<Linkman> findAll() {
        return linkmanDao.findAll();
    }
}
