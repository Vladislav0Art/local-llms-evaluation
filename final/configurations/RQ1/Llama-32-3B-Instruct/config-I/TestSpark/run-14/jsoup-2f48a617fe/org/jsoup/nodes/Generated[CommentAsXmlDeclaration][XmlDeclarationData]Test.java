package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class Generated[CommentAsXmlDeclaration][XmlDeclarationData]

Test {

    @Test
    public void [CommentAsXmlDeclaration][XmlDeclarationData]Test() throws IOException {
        Document doc = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("!XML_declaration");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

}