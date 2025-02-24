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
public class GeneratedTextNodeNodeNameTest {

    @Mock
    private TextNode textNode;

    @Test
    public void textNodeNodeNameTest() {
        String expectedNodeName = "#text";
        TextNode textNode = new TextNode("Some text");
        assertEquals(expectedNodeName, textNode.nodeName());
    }

}