package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockRunner.class)
public class GeneratedText_GivenUnencodedText_ReturnsNormalisedString {

    @Test
    public void text_GivenUnencodedText_ReturnsNormalisedString() {
        String unencodedText = "   Hello World   ";
        TextNode textNode = new TextNode(unencodedText);
        assertEquals("Hello World", PowerMockito.spy(textNode).text().trim(), true);
    }

}