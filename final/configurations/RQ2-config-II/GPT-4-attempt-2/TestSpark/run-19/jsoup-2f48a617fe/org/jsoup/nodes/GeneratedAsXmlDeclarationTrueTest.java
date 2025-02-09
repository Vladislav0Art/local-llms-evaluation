package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAsXmlDeclarationTrueTest {

    @Test
    public void asXmlDeclarationTrueTest() {
        Comment comment = new Comment("?xml version='1.0' encoding='UTF-8' standalone='yes' ?");
        Assert.assertNotNull(comment.asXmlDeclaration());
    }

}