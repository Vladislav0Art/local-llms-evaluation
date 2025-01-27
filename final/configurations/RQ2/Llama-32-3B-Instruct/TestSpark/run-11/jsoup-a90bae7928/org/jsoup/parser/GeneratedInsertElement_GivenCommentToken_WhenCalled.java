package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedInsertElement_GivenCommentToken_WhenCalled {

    @Test
    public void insertElement_GivenCommentToken_WhenCalled() {
        // given
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Comment commentToken = Token.Comment.ROOT;

        // when
        builder.insert(commentToken);

        // then
        assertTrue(builder.process(commentToken) == true);
    }

}