package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestFromClasspathUtf8 {

    @Test
    public void testFromClasspathUtf8() {
        String resource = "resource.txt";
        Builder builder = WordWrap.fromClasspathUtf8(resource);
        assertTrue(builder.toString().equals("This is a test"));
    }

}