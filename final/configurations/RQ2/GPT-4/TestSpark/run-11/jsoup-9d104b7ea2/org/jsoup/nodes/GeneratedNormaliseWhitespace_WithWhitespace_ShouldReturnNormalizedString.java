package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedNormaliseWhitespace_WithWhitespace_ShouldReturnNormalizedString {

    @Test
    public void normaliseWhitespace_WithWhitespace_ShouldReturnNormalizedString() {
        String result = TextNode.normaliseWhitespace(" White space ");
        Assert.assertEquals("White space", result);
    }

}