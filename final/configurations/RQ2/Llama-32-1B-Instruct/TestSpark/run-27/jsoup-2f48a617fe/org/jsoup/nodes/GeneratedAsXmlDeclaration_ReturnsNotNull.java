package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAsXmlDeclaration_ReturnsNotNull {

    @Test
    public void asXmlDeclaration_ReturnsNotNull() {
        Comment comment = new Comment("");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        Assert.assertNotNull(xmlDeclaration);
    }

}