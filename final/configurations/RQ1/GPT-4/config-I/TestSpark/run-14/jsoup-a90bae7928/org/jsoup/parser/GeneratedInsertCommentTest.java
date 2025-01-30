package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertCommentTest {

    @Test
    public void insertCommentTest() {
        Token.Comment comment = new Token.Comment();
        comment.bogus(false);
        comment.setData("<!-- test -->");
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(comment);
        assertEquals(1, builder.doc.childNodes().size());
    }

}