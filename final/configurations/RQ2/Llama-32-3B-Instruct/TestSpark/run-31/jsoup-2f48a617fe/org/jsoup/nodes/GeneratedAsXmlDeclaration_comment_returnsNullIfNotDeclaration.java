package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedAsXmlDeclaration_comment_returnsNullIfNotDeclaration {

    @Test
    public void asXmlDeclaration_comment_returnsNullIfNotDeclaration() {
        Comment comment = new Comment("data");
        assertNull(comment.asXmlDeclaration());
    }

}