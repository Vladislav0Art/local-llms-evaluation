package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class GeneratedBuilderMaxWidthTest {

    @Test
    public void builderMaxWidthTest() {
        Builder builder = WordWrap.from(new StringReader("test width"));
        builder.maxWidth(100);
        String wrapResult = builder.wrap();

        Assert.assertNotNull(wrapResult);
    }

}