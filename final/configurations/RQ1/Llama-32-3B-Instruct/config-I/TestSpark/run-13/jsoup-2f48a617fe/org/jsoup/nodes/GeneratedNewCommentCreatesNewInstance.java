package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNewCommentCreatesNewInstance {

    @Test
    public void newCommentCreatesNewInstance() {
        Comment comment = new Comment("Hello, World!");
        assertNotNull(comment);
        assertTrue(comment instanceof LeafNode);
        assertEquals("#comment", comment.nodeName());
        assertEquals("Hello, World!", comment.getData());
    }

}