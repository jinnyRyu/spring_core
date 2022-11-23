package com.example.core.sacn.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)//class level에 붙음
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
    //이게 붙으면 component scan에 추가 
}
