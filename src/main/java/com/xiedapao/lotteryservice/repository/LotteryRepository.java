package com.xiedapao.lotteryservice.repository;

import com.xiedapao.lotteryservice.entity.Lottery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author xxl 2023/8/1
 */
@Repository
public interface LotteryRepository extends JpaRepository<Lottery, String> {

    Integer countAllByPeriod(Integer period);

    @Query(value = "select t.period from Lottery t order by t.period desc limit 1")
    Integer getMaxPeriod();

}
