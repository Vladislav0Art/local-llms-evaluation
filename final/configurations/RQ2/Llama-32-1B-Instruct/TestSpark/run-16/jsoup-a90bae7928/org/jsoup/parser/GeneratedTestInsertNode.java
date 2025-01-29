package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInsertNode {

    @Test
    public void testInsertNode() {
        String input = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = new Token(Token.StartTag.start(), "hello", null, false);
        Node node = new Element("div");
        builder.insert(node, token);
        Mockito.verify(builder).insertToken(Mockito.any());
    }

}