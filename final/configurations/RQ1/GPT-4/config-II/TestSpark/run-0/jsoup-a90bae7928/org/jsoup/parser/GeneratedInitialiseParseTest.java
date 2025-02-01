package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<test></test>"), "http://base.uri", new Parser(xmlTreeBuilder));

        Document.OutputSettings outputSettings = xmlTreeBuilder.doc.outputSettings();

        Assert.assertEquals(Document.OutputSettings.Syntax.xml, outputSettings.syntax());
        Assert.assertEquals(Entities.EscapeMode.xhtml, outputSettings.escapeMode());
        Assert.assertFalse(outputSettings.prettyPrint());
    }

}