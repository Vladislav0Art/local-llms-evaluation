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
public class GeneratedTextTest {

    @Mock
    private TextNode node;

    @Before
    public void setup() {
        node = new TextNode("This is a text node");
    }

    @Test
    public void textTest() {
        assertEquals("This is a text node", node.text());
    }

}