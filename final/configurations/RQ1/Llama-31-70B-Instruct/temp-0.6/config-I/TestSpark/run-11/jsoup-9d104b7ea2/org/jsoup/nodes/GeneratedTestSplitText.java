package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestSplitText {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("");
    }

    @Test
    public void testSplitText() {
        textNode.text("Text");
        TextNode tailNode = textNode.splitText(0);
        Assert.assertEquals("T", textNode.getWholeText());
        Assert.assertEquals("ext", tailNode.getWholeText());
    }

}