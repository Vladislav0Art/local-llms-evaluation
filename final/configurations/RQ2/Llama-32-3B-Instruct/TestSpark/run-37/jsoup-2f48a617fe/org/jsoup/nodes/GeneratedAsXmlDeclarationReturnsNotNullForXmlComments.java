package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationReturnsNotNullForXmlComments {

    @Test
    public void asXmlDeclarationReturnsNotNullForXmlComments() throws Exception {
        ParseSettings settings = new ParseSettings();
        settings.setXmlDeclaration(true);
        Document doc = Document.parse("<comment>data</comment>", settings);
        Comment comment = doc.body().firstChild(Comment.class);
        assertNotNull(comment.asXmlDeclaration());
    }

}