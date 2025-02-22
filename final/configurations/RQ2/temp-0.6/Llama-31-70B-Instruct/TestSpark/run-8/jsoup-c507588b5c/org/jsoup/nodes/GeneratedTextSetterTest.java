package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("raw text");
        textNode.text("new text");
        assertEquals("new text", textNode.coreValue());
    }

}