package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedAsXmlDeclarationShouldNotIncludeEmptyNodesInResult {

    @Test
    public void asXmlDeclarationShouldNotIncludeEmptyNodesInResult() {
        Comment comment = new Comment("<xml></xml>");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
    }

}