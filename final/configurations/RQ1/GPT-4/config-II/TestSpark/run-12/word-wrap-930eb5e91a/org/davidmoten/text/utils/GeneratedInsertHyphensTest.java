package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.function.Function;

public class GeneratedInsertHyphensTest {

    @Test
    public void insertHyphensTest() {
        Builder builder = WordWrap.from(new StringReader("0123456789"))
                .insertHyphens(true);

        Assert.assertNotNull(builder);
    }

}