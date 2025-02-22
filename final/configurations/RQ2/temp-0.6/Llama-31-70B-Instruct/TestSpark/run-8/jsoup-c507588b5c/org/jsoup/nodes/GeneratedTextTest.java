package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("raw text");
        assertEquals("text", textNode.text());
    }

}