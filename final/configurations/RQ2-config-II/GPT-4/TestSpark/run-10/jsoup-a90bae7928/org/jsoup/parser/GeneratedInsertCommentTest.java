package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertCommentTest {

    @Test
    public void insertCommentTest() {
        // Scenario: Insert Token.Comment into the XmlTreeBuilder
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Comment().getData("Some Comment"));
        List<Node> result = xmlTreeBuilder.stack;
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.get(0) instanceof Comment);
    }

}