package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoups.nodes.LeafNode;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("test");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

}