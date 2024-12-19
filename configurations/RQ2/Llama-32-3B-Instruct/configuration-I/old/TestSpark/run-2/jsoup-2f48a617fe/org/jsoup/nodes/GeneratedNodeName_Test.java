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
public class GeneratedNodeName_Test {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    private Comment comment = new Comment("");

    @Test
    public void nodeName_Test() {
        when(document.nodeName()).thenReturn("comment");
        assertEquals("comment", comment.nodeName());
    }

}