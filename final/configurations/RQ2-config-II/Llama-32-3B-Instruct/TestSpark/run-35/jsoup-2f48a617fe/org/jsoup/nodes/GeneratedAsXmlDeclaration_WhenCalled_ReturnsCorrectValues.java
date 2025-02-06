package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAsXmlDeclaration_WhenCalled_ReturnsCorrectValues {

    @Test
    public void asXmlDeclaration_WhenCalled_ReturnsCorrectValues() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}