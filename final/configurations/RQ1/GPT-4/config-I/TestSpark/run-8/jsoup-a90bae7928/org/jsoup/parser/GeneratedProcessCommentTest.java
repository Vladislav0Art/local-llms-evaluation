package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedProcessCommentTest {

    @Test
    public void ProcessCommentTest() {
        XmlTreeBuilder testObject = new XmlTreeBuilder();
        Comment comment = new Comment("testComment");
        Token testToken = new Token(comment);
        assertTrue(testObject.process(testToken));
    }

}