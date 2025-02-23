package org.jsoup.nodes;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShouldCheckIfLastCharIsWhitespace {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Test Text");
    }

    @Test
    public void shouldCheckIfLastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder("Test Text");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}