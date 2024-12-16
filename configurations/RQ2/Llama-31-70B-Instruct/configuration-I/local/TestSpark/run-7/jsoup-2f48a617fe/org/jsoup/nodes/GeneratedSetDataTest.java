package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        comment.setData("new test");
        assertEquals("new test", comment.getData());
    }

}