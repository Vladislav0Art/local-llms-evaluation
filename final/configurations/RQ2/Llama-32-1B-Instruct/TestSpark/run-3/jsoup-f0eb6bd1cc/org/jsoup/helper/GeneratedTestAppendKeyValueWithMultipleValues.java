package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestAppendKeyValueWithMultipleValues {

    public String appendKeyVal(int value) {
        return "key=" + value;
    }

    @Test
    public void testAppendKeyValueWithMultipleValues() {
        String key = "test";
        int value1 = 3;
        int value2 = 4;
        System.out.println(key + "=" + appendKeyValueWithMultipleValues(value1, value2));
    }

}