package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedInsertToken_GivenCommentToken_ReturnsInsertedComment {

    @Test
    public void insertToken_GivenCommentToken_ReturnsInsertedComment() {
        Token.Comment commentToken = new Token.Comment("child", null);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Comment insertedComment = treeBuilder.insert(commentToken);
        assertNotNull(insertedComment);
        assertEquals("child", insertedComment.data());
    }

}