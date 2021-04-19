package com.study.mysql.multisource.config.mysql;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyDataSource {
    String dataSource() default "";
}
