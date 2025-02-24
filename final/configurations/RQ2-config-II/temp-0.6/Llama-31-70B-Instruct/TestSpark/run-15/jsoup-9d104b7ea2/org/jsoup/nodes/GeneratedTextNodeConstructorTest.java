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
public class GeneratedTextNodeConstructorTest {

    @Mock
    private TextNode textNode;

    @Test
    public void textNodeConstructorTest() {
        String expectedText = "Some text";
        TextNode textNode = new TextNode(expectedText);
        assertEquals(expectedText, textNode.text());
    }

}