package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockRunner.class)
public class GeneratedIsBlank_GivenNonEmptyString_ReturnsFalse {

    @Test
    public void isBlank_GivenNonEmptyString_ReturnsFalse() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertFalse(PowerMockito.spy(textNode).isBlank(), true);
    }

}