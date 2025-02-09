package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.Character token = new Token.Character().data("test");
        treeBuilder.insert(token);
        assertTrue(treeBuilder.getDocument().childNode(0) instanceof TextNode);
    }

}