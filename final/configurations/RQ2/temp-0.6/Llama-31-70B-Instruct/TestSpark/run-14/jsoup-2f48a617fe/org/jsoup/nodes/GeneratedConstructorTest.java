package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
        assertEquals("comment", comment.nodeName());
    }

}