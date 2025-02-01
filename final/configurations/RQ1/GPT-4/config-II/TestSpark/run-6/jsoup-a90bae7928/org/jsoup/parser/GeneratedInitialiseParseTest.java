package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInitialiseParseTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Parser parser = new Parser(xmlTreeBuilder);
        xmlTreeBuilder.initialiseParse(new StringReader("<xml></xml>"), "http://base.com", parser);

        Document.OutputSettings outputSettings = xmlTreeBuilder.getTop().outputSettings();

        assertEquals("Output syntax should be XML", Document.OutputSettings.Syntax.xml, outputSettings.syntax());
        assertEquals("Output escape mode should be XHTML", Entities.EscapeMode.xhtml, outputSettings.escapeMode());
        assertFalse("Pretty Print should be false", outputSettings.prettyPrint());
    }

}