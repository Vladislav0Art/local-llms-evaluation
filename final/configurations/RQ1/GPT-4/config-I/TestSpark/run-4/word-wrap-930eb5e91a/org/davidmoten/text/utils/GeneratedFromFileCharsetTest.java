package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap.Builder;

import java.io.Reader;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() {
        File tempFile = new File("fakefile.txt");
        WordWrap.from(tempFile, StandardCharsets.UTF_8);
    }

}