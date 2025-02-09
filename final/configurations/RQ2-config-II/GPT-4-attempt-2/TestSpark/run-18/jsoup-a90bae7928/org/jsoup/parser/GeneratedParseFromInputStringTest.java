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

public class GeneratedParseFromInputStringTest {

    @Test
    public void parseFromInputStringTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<HTML></HTML>", "baseUriTester");
        Assert.assertNotNull(doc);
    }

}