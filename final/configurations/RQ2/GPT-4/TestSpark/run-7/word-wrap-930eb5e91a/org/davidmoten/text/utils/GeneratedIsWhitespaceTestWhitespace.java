package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

public class GeneratedIsWhitespaceTestWhitespace {

    @Test
    public void isWhitespaceTestWhitespace() {
        Assert.assertTrue(WordWrap.isWhitespace(" "));
    }

}