package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.*;

public class GeneratedWrapTest {

    @Test
    public void wrapTest() {
        WordWrap.Builder builder = WordWrap.from(new StringReader("test"));
        String result = builder.wrap();

        assertNotNull(result);
    }

}