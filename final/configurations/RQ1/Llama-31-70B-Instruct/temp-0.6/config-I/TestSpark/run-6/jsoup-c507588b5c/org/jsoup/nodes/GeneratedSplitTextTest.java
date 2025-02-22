package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitTextTest {

    @Mock
    private TextNode node;

    @Before
    public void setup() {
        node = new TextNode("This is a text node");
    }

    @Test
    public void splitTextTest() {
        TextNode splitNode = node.splitText(5);
        assertEquals("This is", node.getWholeText());
        assertEquals(" a text node", splitNode.getWholeText());
    }

}