package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertCommentTokenTest {

    @Test
    public void insertCommentTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("Test Comment");
        xmlTreeBuilder.insert(commentToken);
        assertTrue(xmlTreeBuilder.currentElement().hasText());
    }

}