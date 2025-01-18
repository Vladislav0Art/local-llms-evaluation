package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertCommentTokenTest {

    @Test
    public void insertCommentTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("test");
        builder.insert(commentToken);
        List<Node> childNodes = builder.getStack();
        assertEquals(childNodes.get(0).childNode(0).nodeName(), "#comment");
        assertEquals(((Comment) childNodes.get(0).childNode(0)).getData(), "test");
    }

}