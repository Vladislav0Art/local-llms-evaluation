package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedWrapToListLineCountTest {

    @Test
    public void wrapToListLineCountTest() {
        WordWrap.Builder builder = WordWrap.from(new StringReader("hello\nworld"));
        assertEquals(2, builder.wrapToList().size());
    }

}