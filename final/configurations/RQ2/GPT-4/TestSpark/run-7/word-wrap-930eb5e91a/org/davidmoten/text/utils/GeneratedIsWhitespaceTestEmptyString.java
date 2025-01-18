package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

public class GeneratedIsWhitespaceTestEmptyString {

    @Test
    public void isWhitespaceTestEmptyString() {
        Assert.assertTrue(WordWrap.isWhitespace(""));
    }

}