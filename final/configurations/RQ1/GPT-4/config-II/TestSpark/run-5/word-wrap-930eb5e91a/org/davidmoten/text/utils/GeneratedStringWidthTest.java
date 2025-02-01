package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class GeneratedStringWidthTest {

    @Test
    public void stringWidthTest() {
        StringReader reader = new StringReader("Test");
        Builder builder = WordWrap.from(reader);
        Map<Character, Integer> charWidths = new HashMap<>();
        charWidths.put('T', 2);
        charWidths.put('e', 1);
        charWidths.put('s', 1);
        charWidths.put('t', 1);
        Function<CharSequence, Number> stringWidthFunction = sequence -> {
            int width = 0;
            for (char c : sequence.toString().toCharArray()) {
                if (charWidths.containsKey(c)) {
                    width += charWidths.get(c);
                }
            }
            return width;
        };
        builder.stringWidth(stringWidthFunction);
        Assert.assertEquals(stringWidthFunction, builder.stringWidth);
    }

}