package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedCommentAsXmlDeclaration {

    @Test
    public void commentAsXmlDeclaration() {
        Comment comment = new Comment("<!DOCTYPE html><html></html>");
        XmlDeclaration asXmlDecl = comment.asXmlDeclaration();
        assert asXmlDecl == null;
    }

}