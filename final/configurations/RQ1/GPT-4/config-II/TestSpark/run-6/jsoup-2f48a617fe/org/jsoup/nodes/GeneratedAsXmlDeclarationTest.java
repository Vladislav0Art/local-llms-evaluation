package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        assertNotNull(comment.asXmlDeclaration());

        // non-XML comment
        Comment nonXmlComment = new Comment("data");
        assertNull(nonXmlComment.asXmlDeclaration());

        // test with comment that looks like XML but is not
        Comment bogusComment = new Comment("?boguscomment?");
        assertNull(bogusComment.asXmlDeclaration());
    }

}