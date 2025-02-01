package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.function.Function;

public class GeneratedExcludeExtraWordCharsTest {

    @Test
    public void excludeExtraWordCharsTest() {
        Builder builder = WordWrap.from(new StringReader("0123456789"))
                .excludeExtraWordChars("ABCXYZ");

        Assert.assertNotNull(builder);
    }

}