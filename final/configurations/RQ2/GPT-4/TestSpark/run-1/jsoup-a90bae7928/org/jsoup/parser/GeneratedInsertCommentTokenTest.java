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

public class GeneratedInsertCommentTokenTest {

    @Test
    public void insertCommentTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("Test Comment");
        builder.insert(commentToken);
        Node node = builder.getStack().get(0);
        assertTrue(node instanceof Comment);
        assertEquals("Test Comment", node.attr("data"));
    }

}