package org.davidmoten.text.utils;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromUtf8StreamTest {

    @Test
    public void fromUtf8StreamTest() {
        InputStream inputStream = new ByteArrayInputStream("sample text".getBytes());
        Builder builder = WordWrap.fromUtf8(inputStream);
        assertNotNull(builder);
    }

}