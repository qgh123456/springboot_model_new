package com.atqgh.springboot.service.impl;

import com.atqgh.springboot.entity.CardMoney;
import com.atqgh.springboot.mapper.CardMoneyMapper;
import com.atqgh.springboot.service.CardMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

/**
 * @author qiguohui
 * @date 2019-09-05 15:06
 * @Description
 */
@Transactional(propagation = Propagation.REQUIRED,readOnly = false)
@Service
public class CardMoneyServiceImpl implements CardMoneyService {

    @Autowired
    CardMoneyMapper cardMoneyMapper;

    /**
     * 转账: 小明往小红的账号中转100块
     */
    @Override
    public void transfer() {
//        CardMoney xiaoming = new CardMoney();
//        xiaoming.setName("xiaoming");
//        CardMoney xiaohong = new CardMoney();
//        xiaohong.setName("xiaohong");
//
//        cardMoneyMapper.selectOne(xiaoming);
//        Example example = new Example(CardMoney.class);
//        Example.Criteria criteria = example.createCriteria();
//        criteria.andEqualTo("xiaoming");
//        CardMoney cardMoney = new CardMoney();
//        cardMoney.setMoney(100.0);
//        cardMoneyMapper.updateByExampleSelective(cardMoney,example);
        CardMoney cardMoneyOne = new CardMoney();
        cardMoneyOne.setName("xiaoming");
        cardMoneyOne.setTransferMoney(100.0);
        CardMoney cardMoneyTwo = new CardMoney();
        cardMoneyTwo.setName("xiaohong");
        cardMoneyTwo.setTransferMoney(100.0);
        cardMoneyMapper.diffMoney(cardMoneyOne);
        cardMoneyMapper.diffMoney(cardMoneyTwo);
    }
}
