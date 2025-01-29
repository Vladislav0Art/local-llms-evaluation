package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTest {

    public String appendKeyVal(int value) {
        return "key=" + value;
    }

    @Test
    public void testAppendKeyVal() {
        String key = "test";
        int value = 3;
        System.out.println(key + "=" + appendKeyVal(value));
    }

    @Test
    public void testAppendKeyValue() {
        String key = "test";
        String value = "\"value1\"";
        System.out.println(key + "=" + appendKeyValue(value));
    }

    @Test
    public void testAppendKeyValueWithValueAsString() {
        String key = "test";
        String value = "\"value1\"";
        System.out.println(key + "=" + appendKeyValueWithMultipleValues(value));
    }

    @Test
    public void testAppendKeyValueWithMultipleValues() {
        String key = "test";
        int value1 = 3;
        int value2 = 4;
        System.out.println(key + "=" + appendKeyValueWithMultipleValues(value1, value2));
    }

}