package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.File;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedFromCharSequenceTest {

    private String testText = "This is a simple test text to be used for testing word wrap functionality";

    @Test
    public void fromCharSequenceTest() {
        Builder builder = WordWrap.from(testText);
        assertNotNull(builder);
    }

}