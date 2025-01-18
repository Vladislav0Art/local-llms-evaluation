package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import static org.junit.Assert.*;

import java.io.File;
import java.io.StringReader;
import java.io.Writer;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        assertNotNull(WordWrap.from(new StringReader("Test String")));
    }

}