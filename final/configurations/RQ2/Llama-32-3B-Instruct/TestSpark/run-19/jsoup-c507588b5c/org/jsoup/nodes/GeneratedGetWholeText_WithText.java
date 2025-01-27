package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetWholeText_WithText {

    @Mock
    private Appendable accum;

    @Test
    public void getWholeText_WithText() {
        String expected = "hello world";
        TextNode node = new TextNode(expected);
        when(this.text()).thenReturn(expected);
        assertEquals(expected, node.getWholeText());
    }

}