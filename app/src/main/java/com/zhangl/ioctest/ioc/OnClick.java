package com.zhangl.ioctest.ioc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhangl on 2018/10/14.
 *
 *
 */

// @Target(ElementType.FIELD) 代表Annotation的位置  FIELD属性  TYPE类上  CONSTRUCTOR 构造函数上
@Target(ElementType.METHOD)
// @Retention(RetentionPolicy.CLASS) 什么时候生效 CLASS编译时   RUNTIME运行时  SOURCE源码资源
@Retention(RetentionPolicy.RUNTIME)
public @interface OnClick {

    int[] value();

}
