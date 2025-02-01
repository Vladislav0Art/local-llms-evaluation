package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedInsertCommentTest {

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "/", new Parser(xmlTreeBuilder));

        Token.Comment commentToken = new Token.Comment();
        commentToken.setData("comment");
        commentToken.bogus(false);

        xmlTreeBuilder.insert(commentToken);

        Node comment = xmlTreeBuilder.currentElement().childNode(0);

        assertEquals("#comment", comment.nodeName());
        assertEquals("comment", comment.outerHtml());
    }

}