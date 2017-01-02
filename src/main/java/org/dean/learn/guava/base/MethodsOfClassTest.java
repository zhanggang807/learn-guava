package org.dean.learn.guava.base;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * 反射获取一个类的方法列表的工具类，用于编码时get/set或者学习总结使用
 *
 * Created by dean on 2017/1/2.
 */
public class MethodsOfClassTest {

    @Test
    public void testGetMethods() {
        Class<Optional> optionalClass = Optional.class;
        Method[] declaredMethods = optionalClass.getDeclaredMethods();
        System.out.println("声明的方法列表大小为" + declaredMethods.length);
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("===========================================");
        Method[] methods = optionalClass.getMethods();
        System.out.println("方法列表大小为" + methods.length);
        for (Method method : methods) {
            System.out.println(method);
        }

        //两个方法列表相差的方法
        System.out.println("========declaredMethods 和 methods方法两者的差集");
        HashSet<Method> methods1 = Sets.newHashSet(Lists.newArrayList(declaredMethods));
        System.out.println(methods1.size());
        HashSet<Method> methods2 = Sets.newHashSet(Lists.newArrayList(methods));
        System.out.println(methods2.size());
        Sets.SetView<Method> difference = Sets.difference(methods2, methods1);
        for (Method method : difference) {
            System.out.println(method);
        }

    }

}
