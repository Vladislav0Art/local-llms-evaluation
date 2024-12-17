package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockRunner.class)
public class GeneratedText_GivenEncodedText_ReturnsDecodedString {

    @Test
    public void text_GivenEncodedText_ReturnsDecodedString() {
        String encodedText = "&lt;Hello&gt; World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("&lt;Hello&gt; World", PowerMockito.spy(textNode).text(), true);
    }

}