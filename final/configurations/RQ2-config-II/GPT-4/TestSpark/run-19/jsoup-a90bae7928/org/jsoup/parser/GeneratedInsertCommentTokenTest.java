package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class GeneratedInsertCommentTokenTest {

    @Test
    public void insertCommentTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Comment comment = new Token.Comment();
        comment.data("data");
        builder.insert(comment);
        Node last = builder.stack.last().childNode(0);
        assertTrue(last instanceof Comment);
        assertEquals("data", ((Comment) last).getData());
    }

}