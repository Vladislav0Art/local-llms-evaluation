package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestIsBlank {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("");
    }

    @Test
    public void testIsBlank() {
        Assert.assertTrue(textNode.isBlank());
        textNode.text("Text");
        Assert.assertFalse(textNode.isBlank());
    }

}