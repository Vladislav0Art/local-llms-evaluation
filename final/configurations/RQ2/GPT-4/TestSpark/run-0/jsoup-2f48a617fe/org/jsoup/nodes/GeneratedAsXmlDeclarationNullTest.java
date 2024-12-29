package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedAsXmlDeclarationNullTest {

    @Test
    public void asXmlDeclarationNullTest() {
        Comment comment = new Comment("data");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}