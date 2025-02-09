package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedFromNonExistentFileTest {

    @Test
    public void fromNonExistentFileTest() throws FileNotFoundException {
        assertNotNull(WordWrap.from(new File("non_existent_file.txt"), StandardCharsets.UTF_8));
    }

}