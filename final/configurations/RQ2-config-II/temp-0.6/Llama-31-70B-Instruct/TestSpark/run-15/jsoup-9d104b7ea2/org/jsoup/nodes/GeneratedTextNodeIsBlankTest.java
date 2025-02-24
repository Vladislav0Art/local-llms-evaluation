package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextNodeIsBlankTest {

    @Mock
    private TextNode textNode;

    @Test
    public void textNodeIsBlankTest() {
        TextNode textNode = new TextNode("Some text");
        assertTrue(!textNode.isBlank());
    }

}