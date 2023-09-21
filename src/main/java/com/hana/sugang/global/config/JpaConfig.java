package com.hana.sugang.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

/**
 * JpaAuditing(BaseEntity)를 설정하기 위한 클래스
 */
@EnableJpaAuditing
@Configuration
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditorAware() {
        //TODO 추후 로그인 기능시 사용
        return () -> Optional.of("hana");
    }
}