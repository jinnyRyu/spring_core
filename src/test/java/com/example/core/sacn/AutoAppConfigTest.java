package com.example.core.sacn;

import com.example.core.AutoAppConfig;
import com.example.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoAppConfigTest {

    @Test
    void basicScan(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberService memberService = applicationContext.getBean(MemberService.class);

        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
    }
    //설정정보로 autoappconfig를 넘겨줌 
    //@componentscan이 @component 가붙은걸 스켄함, autowired 주입
}
