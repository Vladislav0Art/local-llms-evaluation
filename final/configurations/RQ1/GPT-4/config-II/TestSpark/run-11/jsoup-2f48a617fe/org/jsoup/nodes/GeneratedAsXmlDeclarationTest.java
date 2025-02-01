package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!data");
        Assert.assertNotNull(comment.asXmlDeclaration());
        Assert.assertEquals("data", comment.asXmlDeclaration().getWholeDeclaration());

        comment = new Comment("?data");
        Assert.assertNotNull(comment.asXmlDeclaration());
        Assert.assertEquals("data", comment.asXmlDeclaration().getWholeDeclaration());

        comment = new Comment("!?data");
        Assert.assertNull(comment.asXmlDeclaration());

        comment = new Comment("data");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}