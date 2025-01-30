package org.jsoup.parser;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseTest() {
        final Reader input = new StringReader("<test></test>");
        final String baseUri = "http://test.com";
        final XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(input, baseUri);

        assertNotNull(document);
        assertEquals("<test></test>", document.toString());
    }

    @Test
    public void processExceptionTest() {
        final Token.Comment commentToken = new Token.Comment();
        final XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.process(commentToken);
    }

}