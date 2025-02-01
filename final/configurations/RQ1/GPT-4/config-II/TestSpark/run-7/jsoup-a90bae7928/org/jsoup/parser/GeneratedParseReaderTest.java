package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedParseReaderTest {

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(new StringReader("<tag>content</tag>"), "http://example.com");

        assertEquals("content", document.text());
    }

}