package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

import java.io.IOException;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!?xmlDeclarationTest");
        Assert.assertEquals(true, comment.isXmlDeclaration());
    }

}