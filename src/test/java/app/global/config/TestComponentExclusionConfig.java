package app.global.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Profile;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration // Indicates this is a test-specific configuration
@Profile("test") // Only active when 'test' profile is active
@ComponentScan(
    excludeFilters = @ComponentScan.Filter(
        type = FilterType.ASSIGNABLE_TYPE,
        classes = RedisConfig.class // Exclude RedisConfig from component scanning
    )
)
public class TestComponentExclusionConfig {
    // 이 클래스는 테스트 시 RedisConfig를 컴포넌트 스캔에서 제외하기 위해 존재합니다.
}
