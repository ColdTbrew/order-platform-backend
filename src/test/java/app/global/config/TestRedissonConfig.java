package app.global.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration
@Profile("test")
public class TestRedissonConfig {

    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        config.useSingleServer()
              .setAddress("redis://localhost:6379"); // 테스트용 Redis 주소 명시
        return Redisson.create(config);
    }
}
