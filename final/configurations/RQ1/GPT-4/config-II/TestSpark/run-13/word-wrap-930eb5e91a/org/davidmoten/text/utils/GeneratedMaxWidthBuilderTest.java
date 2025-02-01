package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.*;

public class GeneratedMaxWidthBuilderTest {

    @Test
    public void maxWidthBuilderTest() {
        WordWrap.Builder builder = WordWrap.from(new StringReader("test"));
        WordWrap.Builder result = builder.maxWidth(10);

        assertNotNull(result);
    }

}