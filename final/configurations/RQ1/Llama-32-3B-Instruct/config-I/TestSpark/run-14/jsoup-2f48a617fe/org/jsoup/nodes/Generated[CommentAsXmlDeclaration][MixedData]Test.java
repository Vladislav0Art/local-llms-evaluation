package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class Generated[CommentAsXmlDeclaration][MixedData]

Test {

    @Test
    public void [CommentAsXmlDeclaration][MixedData]Test() throws IOException {
        Document doc = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("!XML_declaration " + "?xml version=\"1.0\"?!");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

}