package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoups.nodes.LeafNode;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;

public class GeneratedAsXmlDeclarationNotNULLTest {

    @Test
    public void asXmlDeclarationNotNULLTest() {
        String data = "?xml version=\"1.0\" encoding=\"UTF-8\"?";
        Comment comment = new Comment(data);
        Assert.assertNotNull(comment.asXmlDeclaration());
    }

}