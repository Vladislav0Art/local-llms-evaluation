package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsXmlDeclaration ReturnsNullIfNotXmlDeclaration {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void asXmlDeclaration

    ReturnsNullIfNotXmlDeclaration() {
        Comment comment = new Comment("");
        when(comment.getData()).thenReturn("");
        assertNull(comment.asXmlDeclaration());
    }

}