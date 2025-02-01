package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class GeneratedBuilderWrapWrittenToStreamTest {

    @Test
    public void BuilderWrapWrittenToStreamTest() throws Exception {
        Builder builder = WordWrap.from("Some text to be tested");
        StringWriter sw = new StringWriter();

        builder.wrap(sw);
        assertEquals("Some text to be tested", sw.toString());
    }

}