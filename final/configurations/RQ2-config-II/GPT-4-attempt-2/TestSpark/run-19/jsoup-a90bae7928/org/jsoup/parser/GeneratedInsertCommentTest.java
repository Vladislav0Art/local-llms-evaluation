package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertCommentTest {

    @Test
    public void insertCommentTest() {
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("Meta");
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(commentToken);
        Assert.assertNotNull(xmlTreeBuilder);
    }

}