package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

public class GeneratedParseFragment_InvalidXmlReader_ThrowsNullPointerException {

    @Test
    public void parseFragment_InvalidXmlReader_ThrowsNullPointerException() throws IOException {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        try {
            builder.parseFragment(null, null, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}