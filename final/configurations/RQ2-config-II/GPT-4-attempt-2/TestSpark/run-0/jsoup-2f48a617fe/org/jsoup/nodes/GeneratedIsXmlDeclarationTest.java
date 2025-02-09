package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("test");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

}