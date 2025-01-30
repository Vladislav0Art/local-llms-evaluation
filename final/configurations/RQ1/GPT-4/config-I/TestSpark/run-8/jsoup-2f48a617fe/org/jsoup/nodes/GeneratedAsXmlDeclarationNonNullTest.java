package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedAsXmlDeclarationNonNullTest {

    @Test
    public void asXmlDeclarationNonNullTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\" ?");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        Assert.assertNotNull(xmlDeclaration);
        Assert.assertEquals("xml", xmlDeclaration.name());
        Assert.assertEquals("yes", xmlDeclaration.attr("standalone"));
        Assert.assertEquals("UTF-8", xmlDeclaration.attr("encoding"));
    }

}