package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedParseStringTest {

    @Test
    public void parseStringTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse("<tag>content</tag>", "http://example.com");

        assertEquals("content", document.text());
    }

}