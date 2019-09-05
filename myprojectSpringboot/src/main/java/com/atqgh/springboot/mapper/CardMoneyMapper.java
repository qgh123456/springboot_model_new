package com.atqgh.springboot.mapper;

import com.atqgh.springboot.entity.CardMoney;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author qiguohui
 * @date 2019-09-05 15:01
 * @Description
 */
public interface CardMoneyMapper extends Mapper<CardMoney> {

    public void diffMoney(CardMoney cardMoney);

    public void addMoney(CardMoney cardMoney);
}
