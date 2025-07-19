package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        logger.trace("trace log={}", name);
        logger.debug("debug log={}", name);
        logger.info("info log={}", name);
        logger.warn("warn log={}", name);
        logger.error("error log={}", name);

        // 로그를 사용하지 않아도 a + b 셰산 로직이 먼저 실행됨 다음과 같이 사용하면 안 됨
        // 로그에서 덧셈 연산을 사용하면 의미없는 연산이 생겨서 성능이 저하된다.
        logger.debug("String cannot log=" + name);
        return "ok";
    }
}
