package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String baseUri = "https://some.uri";
        String input = "<tag/>";
        builder.initialiseParse(new StringReader(input), baseUri, new Parser(builder));
        Assert.assertEquals(Document.OutputSettings.Syntax.xml, builder.getDoc().outputSettings().syntax());
        Assert.assertEquals(Entities.EscapeMode.xhtml, builder.getDoc().outputSettings().escapeMode());
        Assert.assertEquals(false, builder.getDoc().outputSettings().prettyPrint());
    }

}