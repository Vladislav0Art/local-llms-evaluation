package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GeneratedTestWordWrapApply {

    @Test
    public void testWordWrapApply() throws Exception {
        WordWrap wordWrap = new WordWrap();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        assertEquals(13L, wordWrap.apply("hello world").length());
    }
}

public class StringBuilder2 {
    private String value;

    public StringBuilder2(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof StringBuilder2 && ((StringBuilder2) obj).value.equals(value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}

public class WordWrap {
    public String apply(String s) {
        // implementation of word wrap application
        return s;
    }

    public void leftTrim(StringBuilder sb) {
        // implementation of left trim functionality
    }

}