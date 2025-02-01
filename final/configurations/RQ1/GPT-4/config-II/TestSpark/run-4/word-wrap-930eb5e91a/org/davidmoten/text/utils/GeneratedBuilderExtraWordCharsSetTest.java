package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class GeneratedBuilderExtraWordCharsSetTest {

    @Test
    public void builderExtraWordCharsSetTest() {
        Builder builder = getDefaultBuilder();
        Set<Character> extraWordChars = new HashSet<>();
        extraWordChars.add('_');
        builder.extraWordChars(extraWordChars);

        Assert.assertEquals("test width", builder.wrap());
    }

}