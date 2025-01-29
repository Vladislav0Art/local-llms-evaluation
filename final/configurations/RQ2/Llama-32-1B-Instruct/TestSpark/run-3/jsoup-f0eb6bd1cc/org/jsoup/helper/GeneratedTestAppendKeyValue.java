package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestAppendKeyValue {

    public String appendKeyVal(int value) {
        return "key=" + value;
    }

    @Test
    public void testAppendKeyValue() {
        String key = "test";
        String value = "\"value1\"";
        System.out.println(key + "=" + appendKeyValue(value));
    }

}