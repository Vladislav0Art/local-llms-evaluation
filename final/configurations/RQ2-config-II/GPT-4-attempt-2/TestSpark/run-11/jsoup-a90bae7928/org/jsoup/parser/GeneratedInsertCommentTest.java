package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertCommentTest {

    @Test
    public void insertCommentTest() {
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("test comment");

        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(commentToken);
        assertNotNull(builder);
    }

}