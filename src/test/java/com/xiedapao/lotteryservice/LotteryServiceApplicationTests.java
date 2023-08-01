package com.xiedapao.lotteryservice;

import com.xiedapao.lotteryservice.entity.Lottery;
import com.xiedapao.lotteryservice.repository.LotteryRepository;
import com.xiedapao.lotteryservice.service.LotteryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class LotteryServiceApplicationTests {

    @Autowired
    private LotteryService lotteryService;

    @Autowired
    private LotteryRepository lotteryRepository;

    @Test
    void contextLoads() {
        Lottery lottery = new Lottery();
        lottery.setType("1");
        lottery.setPeriod(2);
        lottery.setSort(1);
        lottery.setNum("01");
        lottery.setCreateTime(LocalDateTime.now());
        String save = lotteryService.save(lottery);
        System.out.println(save);

        Integer maxPeriod = lotteryRepository.getMaxPeriod();
        System.out.println(maxPeriod);
    }

}
