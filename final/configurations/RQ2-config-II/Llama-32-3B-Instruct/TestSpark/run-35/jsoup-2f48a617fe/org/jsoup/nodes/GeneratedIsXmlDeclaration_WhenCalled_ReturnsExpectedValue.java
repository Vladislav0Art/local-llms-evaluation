package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsXmlDeclaration_WhenCalled_ReturnsExpectedValue {

    @Test
    public void isXmlDeclaration_WhenCalled_ReturnsExpectedValue() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
    }

}