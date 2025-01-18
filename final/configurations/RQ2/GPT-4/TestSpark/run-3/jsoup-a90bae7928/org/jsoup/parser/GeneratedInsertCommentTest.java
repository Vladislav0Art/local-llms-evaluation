package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.Parser;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertCommentTest {

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        xmlTreeBuilder.insert(commentToken);
        Assert.assertTrue(xmlTreeBuilder.getStack().get(0) instanceof org.jsoup.nodes.Comment);
    }

}