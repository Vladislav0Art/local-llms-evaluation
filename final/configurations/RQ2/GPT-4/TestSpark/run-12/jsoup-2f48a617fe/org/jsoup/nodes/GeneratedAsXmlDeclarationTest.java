package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Parser;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("xml declaration");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}