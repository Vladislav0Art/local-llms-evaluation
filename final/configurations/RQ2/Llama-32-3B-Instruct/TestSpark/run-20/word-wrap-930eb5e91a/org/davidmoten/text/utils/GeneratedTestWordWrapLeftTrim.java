package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GeneratedTestWordWrapLeftTrim {

    @Test
    public void testWordWrapLeftTrim() throws Exception {
        WordWrap wordWrap = new WordWrap();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        wordWrap.leftTrim(new StringBuilder2("   hello world"));
    }

}