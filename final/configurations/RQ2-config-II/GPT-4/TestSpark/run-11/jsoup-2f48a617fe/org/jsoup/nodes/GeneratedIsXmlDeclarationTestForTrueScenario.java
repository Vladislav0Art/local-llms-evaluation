package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsXmlDeclarationTestForTrueScenario {

    @Test
    public void isXmlDeclarationTestForTrueScenario() {
        Comment comment = new Comment("<?Test Comment?>");
        Assert.assertTrue(comment.isXmlDeclaration());
    }

}