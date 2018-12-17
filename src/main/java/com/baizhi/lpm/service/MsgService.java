package com.baizhi.lpm.service;


import com.baizhi.lpm.entity.Msg;

import java.util.List;

public interface MsgService {
    public List<Msg> queryAll();

    public void insertMsg(Msg msg);

    public void deleteMsg(Integer id);

    public void updateMsg(Msg msg);

    public Msg queryById(Integer id);
}
