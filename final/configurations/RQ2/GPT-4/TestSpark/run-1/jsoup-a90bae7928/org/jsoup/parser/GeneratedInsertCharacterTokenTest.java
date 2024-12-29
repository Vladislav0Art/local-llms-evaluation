package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedInsertCharacterTokenTest {

    @Test
    public void insertCharacterTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Character characterToken = new Token.Character();
        characterToken.data("a");
        builder.insert(characterToken);
        Node node = builder.getStack().get(0);
        assertTrue(node instanceof TextNode);
        assertEquals("a", node.attr("text"));
    }

}