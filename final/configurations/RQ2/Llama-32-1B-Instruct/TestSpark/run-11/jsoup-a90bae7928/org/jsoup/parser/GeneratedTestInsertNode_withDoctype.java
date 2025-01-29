package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class GeneratedTestInsertNode_withDoctype {

    @Test
    public void testInsertNode_withDoctype() throws IOException {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parseDocument("<root><child></child></root>", null, "http://example.com");
        Element element = document.getElementById("child");
        Token.Doctype d = new Token.Doctype("foo bar baz");
        builder.insert(element, d);
        assertEquals(1, element.getChildren().size());
    }

}