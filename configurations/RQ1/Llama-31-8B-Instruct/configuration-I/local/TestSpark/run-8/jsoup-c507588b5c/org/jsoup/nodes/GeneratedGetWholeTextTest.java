package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitCore.class)
public class GeneratedGetWholeTextTest {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode();
    }

    @Test
    public void getWholeTextTest() {
        textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.getWholeText());
    }

}