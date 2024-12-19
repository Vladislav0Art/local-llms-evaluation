package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedText {

    @Mock
    private LeafNode parentNode;

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void text() {
        TextNode node = createTextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

}