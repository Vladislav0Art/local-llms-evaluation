package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationTreatsBogusCommentsAsCommentIfFollowedByAnother {

    @Test
    public void asXmlDeclarationTreatsBogusCommentsAsCommentIfFollowedByAnother() throws IOException {
        Document doc = new Document();
        Parser parser = new Parser(doc, ParseSettings.DEFAULT);
        parser.parseString("<!-- Bogus XML declaration -->\n<?xml version=\"1.0\"?><some xml>", null);
        Comment comment = new Comment("");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
    }

}