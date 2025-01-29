package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestAppendKeyValueWithValueAsString {

    public String appendKeyVal(int value) {
        return "key=" + value;
    }

    @Test
    public void testAppendKeyValueWithValueAsString() {
        String key = "test";
        String value = "\"value1\"";
        System.out.println(key + "=" + appendKeyValueWithMultipleValues(value));
    }

}