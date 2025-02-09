package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsXmlDeclarationFalseTest {

    @Test
    public void isXmlDeclarationFalseTest() {
        Comment comment = new Comment("Not a declaration");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

}