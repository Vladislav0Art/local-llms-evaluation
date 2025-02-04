package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.mockito.SpyBean;

@RunWith(JUnit4.class)
public class GeneratedCreateFromEncoded_Method_ParsesEncodedTextToNormalisedText {

    @SpyBean
    private LeafNode parentNode;

    @Test
    public void createFromEncoded_Method_ParsesEncodedTextToNormalisedText() {
        String encodedText = "&lt;Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        org.junit.Assert.assertEquals("Hello", textNode.text());
    }

}