package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoups.nodes.LeafNode;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;

public class GeneratedAsXmlDeclarationNULLTest {

    @Test
    public void asXmlDeclarationNULLTest() {
        Comment comment = new Comment("test");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}