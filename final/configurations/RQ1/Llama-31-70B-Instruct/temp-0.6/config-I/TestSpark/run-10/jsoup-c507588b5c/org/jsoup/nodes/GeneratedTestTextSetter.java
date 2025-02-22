package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.Mockito.mock;

public class GeneratedTestTextSetter {

    @Test
    public void testTextSetter() {
        TextNode textNode = new TextNode("test");
        textNode.text("new text");
        Assert.assertEquals("new text", textNode.value);
    }

}