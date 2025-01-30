package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertCommentTest {

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader(""), "http://base.uri/", new Parser(xmlTreeBuilder));
        xmlTreeBuilder.runParser();
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("comment");
        xmlTreeBuilder.insert(commentToken);
        assertEquals("#comment", xmlTreeBuilder.stack.get(0).childNode(0).nodeName());
    }

}