package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.Doctype;
import org.junit.Assert;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentWithoutContextTest {

    @Test
    public void parseFragmentWithoutContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("", "", new Parser(xmlTreeBuilder));
        Assert.assertNotNull(nodes);
    }

}