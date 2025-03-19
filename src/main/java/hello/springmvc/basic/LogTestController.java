package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    //private final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";
        // log.trace("trace = log" + name); -> 더하기 연산 -> 성능 저하 (리소스 낭비)

        // 아래의 함수는 파라미터만 넘기는 것
        log.trace("trace = log={}", name);
        log.debug("debug = log={}", name);
        log.info("info log = {}", name);
        log.warn("warn = log={}", name);
        log.error("error = log={}", name);
        return "ok";
    }
}
