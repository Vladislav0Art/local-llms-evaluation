package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Set;

public class GeneratedFromClasspathUtf8Test {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void fromClasspathUtf8Test() throws UnsupportedEncodingException {
        Builder builder = WordWrap.fromClasspathUtf8("sample.txt");
        Assert.assertNotNull(builder);
    }

}