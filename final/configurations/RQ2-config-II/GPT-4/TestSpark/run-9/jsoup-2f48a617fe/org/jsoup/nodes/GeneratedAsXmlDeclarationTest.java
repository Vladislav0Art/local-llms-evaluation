package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        String data = "Test Comment";
        Comment comment = new Comment(data);

        Assert.assertNull(comment.asXmlDeclaration());
    }

}