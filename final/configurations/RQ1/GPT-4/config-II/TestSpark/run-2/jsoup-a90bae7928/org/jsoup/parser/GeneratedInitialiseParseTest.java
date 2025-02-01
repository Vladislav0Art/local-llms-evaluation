package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root>Test</root>"), "http://test.com", new Parser(xmlTreeBuilder));

        Document.OutputSettings outputSettings = xmlTreeBuilder.doc.outputSettings();
        assertEquals(Document.OutputSettings.Syntax.xml, outputSettings.syntax());
        assertEquals(Entities.EscapeMode.xhtml, outputSettings.escapeMode());
        assertEquals(false, outputSettings.prettyPrint());
    }

}