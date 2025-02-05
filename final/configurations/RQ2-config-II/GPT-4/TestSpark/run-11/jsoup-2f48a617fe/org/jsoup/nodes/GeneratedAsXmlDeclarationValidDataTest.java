package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAsXmlDeclarationValidDataTest {

    @Test
    public void asXmlDeclarationValidDataTest() {
        Comment comment = new Comment("<?Test Comment?>");
        Assert.assertNotNull(comment.asXmlDeclaration());
    }

}