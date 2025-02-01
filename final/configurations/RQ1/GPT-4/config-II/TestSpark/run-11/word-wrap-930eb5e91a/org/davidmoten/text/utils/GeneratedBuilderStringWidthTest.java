package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedBuilderStringWidthTest {

    @Test
    public void builderStringWidthTest() {
        WordWrap.Builder builder = WordWrap.from("abc");
        builder.stringWidth(CharSequence::length);
        assertEquals("abc", builder.wrap());
    }

}