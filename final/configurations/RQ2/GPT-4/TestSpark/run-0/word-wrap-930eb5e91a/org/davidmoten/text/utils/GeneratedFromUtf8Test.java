package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromUtf8(new ByteArrayInputStream("test".getBytes()));
        assertEquals(WordWrap.Builder.class, builder.getClass());
    }

}