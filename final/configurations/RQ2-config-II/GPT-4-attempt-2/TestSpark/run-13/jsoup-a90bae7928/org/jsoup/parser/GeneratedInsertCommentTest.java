package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedInsertCommentTest {

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment().data("This is a comment");
        treeBuilder.insert(commentToken);
        assertTrue(treeBuilder.getDocument().childNode(0) instanceof Comment);
    }

}