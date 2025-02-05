package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedFromFileTest {

    @Test
    public void fromFileTest() throws FileNotFoundException {
        final WordWrap.Builder builder = WordWrap.from(new File("non_existent_file.txt"), StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

}