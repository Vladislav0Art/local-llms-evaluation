package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSplitText {

    @Mock
    private String text;

    @Mock
    private StringBuilder sb;

    public void setText(String text) {
        this.text = text;
    }

    public void set

    Sb(StringBuilder sb) {
        this.sb = sb;
    }

    @Test
    public void testSplitText() {
        String text = "Hello World";
        when(text.substring(0, 5)).thenReturn("Hello ");
        TextNode node = new TextNode(text);
        TextNode expected = new TextNode(node.text().substring(0, 6));
        assertTrue(node.splitText(5).equals(expected));
    }

}