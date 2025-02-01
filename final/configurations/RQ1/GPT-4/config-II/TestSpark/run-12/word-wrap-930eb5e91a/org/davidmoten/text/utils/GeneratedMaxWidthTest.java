package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.function.Function;

public class GeneratedMaxWidthTest {

    @Test
    public void maxWidthTest() {
        Builder builder = WordWrap.from(new StringReader("0123456789"))
                .maxWidth(5);

        Assert.assertNotNull(builder);
    }

}