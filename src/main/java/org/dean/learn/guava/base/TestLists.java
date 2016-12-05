package org.dean.learn.guava.base;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
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

}
