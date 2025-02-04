package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.jsoup.nodes.TextNode.NORMALISED_WHITE_SPACE;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWhenCreatedWithText_thenValueIsSet {

    @Mock
    private Node parentNode;

    @Mock
    private Document document;

    @Test
    public void whenCreatedWithText_thenValueIsSet() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.value);
    }

}