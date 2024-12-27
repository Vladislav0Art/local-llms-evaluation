package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedInsertTokenCommentTest {

    @Test
    public void insertTokenCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        commentToken.setData("comment");
        xmlTreeBuilder.insert(commentToken);
        assertTrue(xmlTreeBuilder.stack.getFirst() instanceof Comment);
    }

}