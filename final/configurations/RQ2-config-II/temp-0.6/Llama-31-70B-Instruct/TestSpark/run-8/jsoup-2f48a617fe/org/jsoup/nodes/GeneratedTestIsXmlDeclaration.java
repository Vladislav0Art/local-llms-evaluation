package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class GeneratedTestIsXmlDeclaration {

    @Mock
    private String data;
    private Comment comment;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        comment = new Comment(data);
    }

    @Test
    public void testIsXmlDeclaration() {
        assertTrue(comment.isXmlDeclaration());
    }

}