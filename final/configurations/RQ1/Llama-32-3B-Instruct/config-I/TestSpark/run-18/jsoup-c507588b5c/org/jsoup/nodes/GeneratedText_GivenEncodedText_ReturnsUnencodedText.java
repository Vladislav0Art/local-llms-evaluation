package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedText_GivenEncodedText_ReturnsUnencodedText {

    @Mock
    private Node parentNode;

    @Test
    public void text_GivenEncodedText_ReturnsUnencodedText() {
        String encodedText = "&lt;Hello&gt; &amp;World&amp;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("&lt;Hello&gt; &amp;World&amp;", textNode.text());
    }

}