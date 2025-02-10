package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Token;
import org.junit.Test;

public class GeneratedTestInsert {

    @Test
    public void testInsert() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = new XmlTreeBuilder.Token(XmlTreeBuilder.Token.Type.Character, "&");
        builder.insert(token);
    }

}