package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

public class GeneratedParseFragment_InvalidXmlReader_ThrowsIOException {

    @Test
    public void parseFragment_InvalidXmlReader_ThrowsIOException() throws IOException {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        try {
            builder.parseFragment(null, null, null);
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

}