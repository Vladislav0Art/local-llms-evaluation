package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = " Multiple   white     spaces ";
        String normalised = TextNode.normaliseWhitespace(text);
        Assert.assertEquals(" Multiple white spaces ", normalised);
    }

}