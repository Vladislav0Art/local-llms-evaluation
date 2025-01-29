package org.davidmoten.text.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTestLeftTrim {

    @Test
    public void testLeftTrim() throws IOException {
        StringBuilder2 word = new StringBuilder2();
        for (int i = 0; i < 5; i++) {
            word.append('a');
        }
        word.trimToSize();
        assertEquals("ab", word.toString());
    }

}