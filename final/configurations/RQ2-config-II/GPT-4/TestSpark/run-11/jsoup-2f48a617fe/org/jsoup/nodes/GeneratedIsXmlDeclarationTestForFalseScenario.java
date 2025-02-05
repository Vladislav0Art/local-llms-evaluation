package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsXmlDeclarationTestForFalseScenario {

    @Test
    public void isXmlDeclarationTestForFalseScenario() {
        Comment comment = new Comment("Test Comment");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

}