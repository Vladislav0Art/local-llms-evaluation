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

public class GeneratedParseMethodsTest {

    @Test
    public void parseMethodsTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String baseUri = "https://some.uri";
        String input = "<tag/>";
        Assert.assertNotNull(builder.parse(new StringReader(input), baseUri));
        Assert.assertNotNull(builder.parse(input, baseUri));
    }

}