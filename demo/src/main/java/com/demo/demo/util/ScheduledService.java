package com.demo.demo.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author 李海强
 * @description 定时任务类
 * @date 2019/11/13 20:00
 */
@Slf4j
@Component
public class ScheduledService {
    @Scheduled(cron = "0/5 * * * * *")
    public void scheduled() {
        log.info("=====>>>>>使用cron  {}", System.currentTimeMillis());
    }

    @Scheduled(fixedRate = 5000)
    public void scheduled1() {
        log.info("=====>>>>>使用fixedRate{}", System.currentTimeMillis());
    }

    @Scheduled(fixedDelay = 5000)
    public void scheduled2() {
        log.info("=====>>>>>fixedDelay{}", System.currentTimeMillis());
    }
}
