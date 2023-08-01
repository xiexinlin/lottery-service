package com.xiedapao.lotteryservice.service.impl;

import com.xiedapao.lotteryservice.entity.Lottery;
import com.xiedapao.lotteryservice.repository.LotteryRepository;
import com.xiedapao.lotteryservice.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xxl 2023/8/1
 */
@Service
public class LotteryServiceImpl implements LotteryService {

    @Autowired
    private LotteryRepository lotteryRepository;

    @Override
    public String save(Lottery lottery) {
        Lottery save = lotteryRepository.save(lottery);
        return save.getId();
    }

}
