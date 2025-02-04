package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedToStringMethod_ReturnsCorrectValueWhenPrettyPrintEnabledTest {

    @Test
    public void toStringMethod_ReturnsCorrectValueWhenPrettyPrintEnabledTest() {
        Document document = Mockito.mock(Document.class);
        Appendable appendable = Mockito.mock(Appendable.class);
        int depth = 0;
        Comment comment = new Comment("<!-- This is a test -->");
        String expectedOutput = "<!--This is a test-->\n";
        comment.toString();
        assertEquals(expectedOutput, appendable.toString());
    }

}