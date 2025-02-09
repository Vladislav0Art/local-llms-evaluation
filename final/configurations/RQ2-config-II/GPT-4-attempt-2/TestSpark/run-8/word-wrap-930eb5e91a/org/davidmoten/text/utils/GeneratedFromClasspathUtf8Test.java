package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;

public class GeneratedFromClasspathUtf8Test {

    @Test
    public void fromClasspathUtf8Test() {
        Builder builder = WordWrap.fromClasspathUtf8("test/resource/path");
        assertNotNull(builder);
    }

}