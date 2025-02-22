package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.Mockito.mock;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode siblingNode = textNode.splitText(2);
        Assert.assertEquals("te", textNode.value);
        Assert.assertEquals("st", siblingNode.value);
        Assert.assertEquals(textNode.parentNode, siblingNode.parentNode);
        Assert.assertEquals(textNode.siblingIndex() + 1, siblingNode.siblingIndex());
    }

}