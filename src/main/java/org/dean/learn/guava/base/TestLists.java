package org.dean.learn.guava.base;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
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

    /** 分区功能，是不是可以做分页使用啊 */
    @Test public void testPartition() throws Exception { ArrayList<Integer> integers = Lists.newArrayList(1, 2, 3, 4); List<List<Integer>> partition = Lists.partition(integers, 3); for (List<Integer> integer : partition) { System.out.println(integer); } } @Test public void testCharactersOf() throws Exception {
        ImmutableList<Character> characters = Lists.charactersOf("新年快乐");
        for (Character character : characters) {
            System.out.print(character);
            System.out.print('-');
        }
        System.out.println("==================================================");
        List<Character> charSequence = Lists.charactersOf(new StringBuffer("我实现了CharSequence接口"));
        for (Character character : charSequence)  {
            System.out.print(character);
            System.out.print('-');
        }
    }

}
