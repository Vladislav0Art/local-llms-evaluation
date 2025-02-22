package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.helper.StringUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShouldSplitTextNode {

    private TextNode textNode;

    @Mock
    private TextNode textNodeMock;

    @Before
    public void init() {
        textNode = new TextNode("text");
    }

    @Test
    public void shouldSplitTextNode() {
        TextNode textNode = new TextNode("text");
        TextNode tailNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("xt", tailNode.getWholeText());
    }

}