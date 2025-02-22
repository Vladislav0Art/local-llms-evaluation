package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShouldGetTextContent {

    private TextNode textNode;

    @Mock
    private TextNode mockedTextNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Hello World");
    }

    @Test
    public void shouldGetTextContent() {
        assertEquals("Hello World", textNode.text());
    }

}