package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAsXmlDeclarationTest_whenItIsComment_thenException {

    @Test
    public void asXmlDeclarationTest_whenItIsComment_thenException() {
        Comment comment = new Comment("testComment");
        comment.asXmlDeclaration();
    }

}