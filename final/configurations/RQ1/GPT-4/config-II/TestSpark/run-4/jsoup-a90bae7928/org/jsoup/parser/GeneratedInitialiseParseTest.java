package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader input = new StringReader("<root></root>");
        xmlTreeBuilder.initialiseParse(input, "baseUri", new Parser(xmlTreeBuilder));

        assertTrue(xmlTreeBuilder.stack.contains(xmlTreeBuilder.doc));
        assertEquals(Document.OutputSettings.Syntax.xml, xmlTreeBuilder.doc.outputSettings().syntax());
        assertEquals(Entities.EscapeMode.xhtml, xmlTreeBuilder.doc.outputSettings().escapeMode());
        assertFalse(xmlTreeBuilder.doc.outputSettings().prettyPrint());
    }

}