package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTextNodeTextTest {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("test");
    }

    @Test
    public void textNodeTextTest() {
        assertEquals("test", textNode.text());
    }

}