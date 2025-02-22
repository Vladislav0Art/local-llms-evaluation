package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetWholeTextTest {

    private TextNode textNode = new TextNode("some text");

    @Mock
    private Document document;

    @Test
    public void getWholeTextTest() {
        assertEquals("some text", textNode.getWholeText());
    }

}