package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationWrongTest {

    @Test
    public void asXmlDeclarationWrongTest() {
        Comment comment = new Comment("Just a comment");
        comment.asXmlDeclaration();
    }

}