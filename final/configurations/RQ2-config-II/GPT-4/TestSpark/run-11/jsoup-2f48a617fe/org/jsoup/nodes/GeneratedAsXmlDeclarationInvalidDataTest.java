package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAsXmlDeclarationInvalidDataTest {

    @Test
    public void asXmlDeclarationInvalidDataTest() {
        Comment comment = new Comment("Test Comment");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}