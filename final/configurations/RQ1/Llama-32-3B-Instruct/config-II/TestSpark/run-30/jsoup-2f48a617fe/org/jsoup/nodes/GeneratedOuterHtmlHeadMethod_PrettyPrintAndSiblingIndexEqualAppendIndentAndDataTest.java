package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadMethod_PrettyPrintAndSiblingIndexEqualAppendIndentAndDataTest {

    @Test
    public void outerHtmlHeadMethod_PrettyPrintAndSiblingIndexEqualAppendIndentAndDataTest() {
        Document document = Mockito.mock(Document.class);
        Appendable appendable = Mockito.mock(Appendable.class);
        int depth = 0;
        Comment comment = new Comment("<!-- This is a test -->");
        String expectedOutput = "<!--This is a test-->\n";
        comment.outerHtmlHead(appendable, depth, document.OutputSettings.Builder().prettyPrint().build());
        assertEquals(expectedOutput, appendable.toString());
    }

}