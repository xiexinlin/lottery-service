package com.xiedapao.lotteryservice.schedule;

import com.xiedapao.lotteryservice.repository.LotteryRepository;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author xxl 2023/8/1
 */
@Slf4j
@Component
public class LotterySchedule {

    @Value("${lottery.server-url}")
    private String lotteryServerUrl;

    @Autowired
    private LotteryRepository lotteryRepository;

    @Scheduled(cron = "0 0 1 * * *")
    public void autoParseLottery() {
        Document document = null;
        try {
            document = Jsoup.connect(lotteryServerUrl).get();
            this.doParse(document);
        } catch (Exception e) {
            log.error("autoParseLottery, error message: " + e.getMessage());
        }
    }

    private void doParse(Document document) {

    }

}
