package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsXmlDeclarationFalseTest {

    @Test
    public void isXmlDeclarationFalseTest() {
        Comment comment = new Comment("not a xml declaration");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

}