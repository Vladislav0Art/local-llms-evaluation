package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;

import java.io.IOException;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment normalComment = new Comment("test");
        Assert.assertNull(normalComment.asXmlDeclaration());
        Comment xmlComment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?");
        XmlDeclaration xmlDeclaration = xmlComment.asXmlDeclaration();
        Assert.assertNotNull(xmlDeclaration);
        Assert.assertEquals("1.0", xmlDeclaration.attr("version"));
        Assert.assertEquals("UTF-8", xmlDeclaration.attr("encoding"));
        Assert.assertEquals("no", xmlDeclaration.attr("standalone"));
    }

}