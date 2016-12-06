package org.dean.learn.guava.base;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Lists 类的一些简单用法
 * Created by dean on 2016/11/30.
 */
public class TestLists {

    @Test
    public void newArrayList() {
        List<Integer> integers = Lists.newArrayList(1, 2, 3, 4);

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    @Test
    public void reverse(){
        List<Integer> integers = Lists.newArrayList(1, 2, 3, 4);
        List<Integer> reverse = Lists.reverse(integers);
        for (Integer integer : reverse) {
            System.out.println(integer);
        }
    }

    @Test
    public void transform(){
        List<Integer> integers = Lists.newArrayList(1, 2, 3, 4);
        List<Integer> transform = Lists.transform(integers, new Function<Integer, Integer>() {
            public Integer apply(Integer integer) {
                return integer + 10;
            }
        });

        for (Integer integer : transform) {
            System.out.println(integer);
        }
    }

    /** 测试笛卡尔积 */
    @Test
    public void cartesianProduct(){
        List<Integer> integersA = Lists.newArrayList(1, 2, 3, 4);
        List<Integer> integersB = Lists.newArrayList(5,6);
        List<List<Integer>> lists = Lists.cartesianProduct(integersA, integersB);
        for (List<Integer> list : lists) {
            System.out.println("--");
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }

}
