package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.Mockito.mock;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("test", textNode.text());
    }

}