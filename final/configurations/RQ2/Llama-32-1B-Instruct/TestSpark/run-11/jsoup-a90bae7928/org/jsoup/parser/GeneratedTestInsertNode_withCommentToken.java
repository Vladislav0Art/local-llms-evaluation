package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class GeneratedTestInsertNode_withCommentToken {

    @Test
    public void testInsertNode_withCommentToken() throws IOException {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parseDocument("<root><child></child></root>", null, null);
        Element element = document.getElementById("child");
        Token.Comment commentToken = new Token.Comment("foo bar baz");
        builder.insert(element, commentToken);
        assertEquals(1, element.getAttributes().size());
    }

}