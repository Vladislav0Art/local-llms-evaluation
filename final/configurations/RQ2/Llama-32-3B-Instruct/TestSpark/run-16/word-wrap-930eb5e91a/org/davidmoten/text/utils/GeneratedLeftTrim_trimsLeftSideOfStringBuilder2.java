package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;

public class GeneratedLeftTrim_trimsLeftSideOfStringBuilder2 {

    @Test
    public void leftTrim_trimsLeftSideOfStringBuilder2() {
        StringBuilder builder = new StringBuilder();
        WordWrap.leftTrim(builder);
        assertEquals("", builder.toString());
    }

}