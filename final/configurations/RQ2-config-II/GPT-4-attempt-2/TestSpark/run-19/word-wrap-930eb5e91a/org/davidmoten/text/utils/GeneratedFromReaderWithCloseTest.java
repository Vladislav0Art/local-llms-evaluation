package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedFromReaderWithCloseTest {

    @Test
    public void fromReaderWithCloseTest() {
        assertNotNull(WordWrap.from(new StringReader("test data"), true));
    }

}