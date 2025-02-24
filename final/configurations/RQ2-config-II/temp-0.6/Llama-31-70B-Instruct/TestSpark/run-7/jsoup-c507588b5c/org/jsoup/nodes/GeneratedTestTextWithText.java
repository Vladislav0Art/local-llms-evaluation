package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestTextWithText {

    @InjectMocks
    private TextNode textNode;

    @Test
    public void testTextWithText() {
        textNode.text("Text");
        assertEquals("Text", textNode.text());
    }

}