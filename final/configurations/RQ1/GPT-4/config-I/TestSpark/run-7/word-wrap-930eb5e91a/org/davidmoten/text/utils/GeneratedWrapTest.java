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

public class GeneratedWrapTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void wrapTest() {
        StringReader reader = new StringReader("Some input string");
        String wrapStr = WordWrap.from(reader).wrap();
        Assert.assertEquals(wrapStr, "Some input string");
    }

}