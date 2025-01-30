package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<sample>example</sample>"), "http://sample.com",
                new Parser(xmlTreeBuilder));
        Document.OutputSettings outputSettings = xmlTreeBuilder.getSettings();
        assertEquals(Document.OutputSettings.Syntax.xml, outputSettings.syntax());
        assertEquals(Entities.EscapeMode.xhtml, outputSettings.escapeMode());
    }

}