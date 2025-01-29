package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsXmlDeclaration_ReturnsFalse {

    @Test
    public void isXmlDeclaration_ReturnsFalse() {
        Comment comment = new Comment("");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

}