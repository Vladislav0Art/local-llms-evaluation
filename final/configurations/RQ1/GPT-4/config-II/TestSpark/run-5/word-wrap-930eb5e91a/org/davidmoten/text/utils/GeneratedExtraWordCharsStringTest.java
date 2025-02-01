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

public class GeneratedExtraWordCharsStringTest {

    @Test
    public void extraWordCharsStringTest() {
        StringReader reader = new StringReader("Test");
        Builder builder = WordWrap.from(reader);
        String wordChars = "aeiou";
        builder.extraWordChars(wordChars);
        Assert.assertEquals(wordChars, builder.extraWordChars);
    }

}