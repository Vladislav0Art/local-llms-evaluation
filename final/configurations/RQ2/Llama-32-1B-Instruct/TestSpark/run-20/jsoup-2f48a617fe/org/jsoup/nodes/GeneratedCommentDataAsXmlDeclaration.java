package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedCommentDataAsXmlDeclaration {

    @Test
    public void commentDataAsXmlDeclaration() {
        String xmlDeclaration = "<!DOCTYPE html><html></html>";
        Comment comment = new Comment(xmlDeclaration);
        assert comment.getData() == null;
    }

}