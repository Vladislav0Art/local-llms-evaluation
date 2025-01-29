package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedCommentIsXmlDeclaration {

    @Test
    public void commentIsXmlDeclaration() {
        String xmlDeclaration = "<!DOCTYPE html><html></html>";
        Comment comment = new Comment(xmlDeclaration);
        assert comment.isXmlDeclaration();
    }

}