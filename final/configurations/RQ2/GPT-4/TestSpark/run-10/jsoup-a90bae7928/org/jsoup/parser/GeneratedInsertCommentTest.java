package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertCommentTest {

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.Comment("test comment"));
        Node commentNode = builder.stack.peek().childNode(0);
        assertTrue(commentNode instanceof Comment);
        assertEquals("test comment", ((Comment) commentNode).getData());
    }

}