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

public class GeneratedInsertCommentTokenTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void insertCommentTokenTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.Comment commentToken = Mockito.mock(Token.Comment.class);
        Mockito.when(commentToken.getData()).thenReturn("<?xml version=\"1.0\"?>");
        Mockito.when(commentToken.isBogus()).thenReturn(true);

        treeBuilder.insert(commentToken);

        List<Node> nodes = treeBuilder.getTop().childNodes();
        assertEquals(1, nodes.size());

        assertTrue(nodes.get(0) instanceof XmlDeclaration);
    }

}