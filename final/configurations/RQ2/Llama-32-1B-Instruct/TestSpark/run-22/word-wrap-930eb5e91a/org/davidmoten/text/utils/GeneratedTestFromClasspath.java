package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestFromClasspath {

    @Test
    public void testFromClasspath() {
        String resource = "resource.txt";
        File file = new File("resource.txt");
        Builder builder = WordWrap.fromClasspath(file, StandardCharsets.UTF_8);
        assertTrue(builder.toString().equals("This is a test"));
    }

}