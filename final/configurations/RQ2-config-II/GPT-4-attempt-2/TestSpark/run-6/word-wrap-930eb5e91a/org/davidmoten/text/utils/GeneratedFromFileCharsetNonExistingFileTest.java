package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class GeneratedFromFileCharsetNonExistingFileTest {

    @Test
    public void fromFileCharsetNonExistingFileTest() throws FileNotFoundException {
        WordWrap.from(new File("non-existing-file"), StandardCharsets.UTF_8);
    }

}