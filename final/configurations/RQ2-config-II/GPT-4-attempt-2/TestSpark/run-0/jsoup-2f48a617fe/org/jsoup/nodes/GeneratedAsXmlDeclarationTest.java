package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("test");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}