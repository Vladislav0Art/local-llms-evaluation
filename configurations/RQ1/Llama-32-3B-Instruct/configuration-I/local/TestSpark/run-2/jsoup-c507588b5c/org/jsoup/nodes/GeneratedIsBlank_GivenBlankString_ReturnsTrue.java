package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockRunner.class)
public class GeneratedIsBlank_GivenBlankString_ReturnsTrue {

    @Test
    public void isBlank_GivenBlankString_ReturnsTrue() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(PowerMockito.spy(textNode).isBlank(), true);
    }

}