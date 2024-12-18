package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTestIsXmlDeclaration {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("test");
    }

    @Test
    public void testIsXmlDeclaration() {
        assertEquals(false, comment.isXmlDeclaration());
    }

}