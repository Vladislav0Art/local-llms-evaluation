package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Before;
import org.junit.After;

public class GeneratedGetWholeTextTest {

    private TextNode node;
    private String text = "This is a test";
    private String encodedText = "&lt;This is a test&gt;";

    @Before
    public void setUp() {
        node = new TextNode(text);
    }

    @After
    public void tearDown() {
        node = null;
    }

    @Test
    public void getWholeTextTest() {
        assertEquals(text, node.getWholeText());
    }

}