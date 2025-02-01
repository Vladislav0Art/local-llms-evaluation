package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertCharacterTokenTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void insertCharacterTokenTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.Character characterToken = new Token.Character().data("CharData");

        treeBuilder.insert(characterToken);

        List<Node> nodes = treeBuilder.getTop().childNodes();
        assertEquals(1, nodes.size());

        assertTrue(nodes.get(0) instanceof TextNode);
    }

}