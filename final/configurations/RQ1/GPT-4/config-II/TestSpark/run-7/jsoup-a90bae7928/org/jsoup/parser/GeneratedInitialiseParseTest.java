package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse(new StringReader("<tag>content</tag>"), "http://example.com", Mockito.mock(Parser.class));

        Document doc = builder.doc;
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        assertEquals(Entities.EscapeMode.xhtml, doc.outputSettings().escapeMode());
        assertFalse(doc.outputSettings().prettyPrint());
    }

}