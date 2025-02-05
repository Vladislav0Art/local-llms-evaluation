package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("data");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

}