package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.mockito.SpyBean;

@RunWith(JUnit4.class)
public class GeneratedTextMethod_NormalText_ReturnsNormalisedText {

    @SpyBean
    private LeafNode parentNode;

    @Test
    public void textMethod_NormalText_ReturnsNormalisedText() {
        TextNode textNode = new TextNode("   ");
        org.junit.Assert.assertEquals(StringUtil.normaliseWhitespace("   "), textNode.text());
    }

}