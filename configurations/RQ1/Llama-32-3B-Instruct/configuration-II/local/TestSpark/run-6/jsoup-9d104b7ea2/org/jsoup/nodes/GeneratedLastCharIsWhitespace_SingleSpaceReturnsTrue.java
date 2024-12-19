package org.jsoup.nodes;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedLastCharIsWhitespace_SingleSpaceReturnsTrue {

    @Mock
    private Node parentNode;

    @Mock
    private Element parentElement;

    @Mock
    private Appendable accum;

    @Test
    public void lastCharIsWhitespace_SingleSpaceReturnsTrue() {
        StringBuilder sb = new StringBuilder();
        sb.append(' ');

        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}