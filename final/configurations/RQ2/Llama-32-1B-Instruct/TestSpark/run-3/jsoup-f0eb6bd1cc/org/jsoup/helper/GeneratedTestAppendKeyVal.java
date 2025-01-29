package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestAppendKeyVal {

    public String appendKeyVal(int value) {
        return "key=" + value;
    }

    @Test
    public void testAppendKeyVal() {
        String key = "test";
        int value = 3;
        System.out.println(key + "=" + appendKeyVal(value));
    }

}