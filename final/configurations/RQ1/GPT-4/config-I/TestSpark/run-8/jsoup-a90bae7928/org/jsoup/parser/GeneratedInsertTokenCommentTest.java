package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertTokenCommentTest {

    @Test
    public void InsertTokenCommentTest() {
        XmlTreeBuilder testObject = new XmlTreeBuilder();
        Comment comment = new Comment("testComment");
        testObject.insert(new Token(comment));
        assertEquals("testComment", ((Comment) testObject.getCurrentElement().childNode(0)).getData());
    }

}