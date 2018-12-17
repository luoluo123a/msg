package com.baizhi.lpm.service;

import com.baizhi.lpm.entity.Msg;
import com.baizhi.lpm.mapper.MsgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MsgServiceImpl implements MsgService {
    @Autowired
    private MsgMapper msgMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Msg> queryAll() {
        List<Msg> list = msgMapper.selectAll();
        return list;
    }

    @Override
    public void insertMsg(Msg msg) {

    }

    @Override
    public void deleteMsg(Integer id) {

    }

    @Override
    public void updateMsg(Msg msg) {

    }

    @Override
    public Msg queryById(Integer id) {
        return null;
    }
}
