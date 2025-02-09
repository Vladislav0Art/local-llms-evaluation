package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertCommentTest {

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        commentToken.setData("test comment");
        xmlTreeBuilder.insert(commentToken);
        assertEquals("test comment", ((Comment) xmlTreeBuilder.doc.childNode(0)).getData());
    }

}