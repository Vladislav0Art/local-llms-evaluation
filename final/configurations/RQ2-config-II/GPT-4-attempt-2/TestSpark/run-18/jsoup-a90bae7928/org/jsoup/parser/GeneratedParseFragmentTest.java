package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.parser.Token.Character;
import org.jsoup.parser.Token.Doctype;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<HTML></HTML>", "baseUriTester", new Parser(builder));
        Assert.assertNotNull(nodes);
    }

}