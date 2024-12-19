package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsXmlDeclaration_Test {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    private Comment comment = new Comment("");

    @Test
    public void isXmlDeclaration_Test() {
        // This test case should return false because there is no XML declaration in the document.
        when(document.toString()).thenReturn("<html>test</html>");
        assertFalse(comment.isXmlDeclaration());
    }

}