package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://example.com", new Parser(xmlTreeBuilder));
        Document.OutputSettings outputSettings = xmlTreeBuilder.getSettings().outputSettings();
        assertEquals(Document.OutputSettings.Syntax.xml, outputSettings.syntax());
        assertEquals(Entities.EscapeMode.xhtml, outputSettings.escapeMode());
        assertFalse(outputSettings.prettyPrint());
    }

}