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

public class GeneratedParseReaderVersionTest {

    @Test
    public void parseReaderVersionTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader reader = new StringReader("");
        Document document = xmlTreeBuilder.parse(reader, "");
        Assert.assertNotNull(document);
    }

}