package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment commentNode = new Comment("");
        Document.OutputSettings outputSettings = new Document.OutputSettings();

        StringBuilder stringBuilder = new StringBuilder();
        commentNode.outerHtmlTail(stringBuilder, 0, outputSettings);

        String expectedHtml = "";
        assertEquals(expectedHtml, stringBuilder.toString());
    }

}