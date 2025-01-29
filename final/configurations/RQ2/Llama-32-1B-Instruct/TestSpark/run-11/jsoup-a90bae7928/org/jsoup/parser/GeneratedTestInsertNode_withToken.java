package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class GeneratedTestInsertNode_withToken {

    @Test
    public void testInsertNode_withToken() throws IOException {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parseDocument("<root><child></child></root>", null, null);
        Token token = new Token.Character("a");
        builder.insert(document.getElementById("child"), token);
        assertEquals(1, document.getElementById("child").getChildren().size());
    }

}