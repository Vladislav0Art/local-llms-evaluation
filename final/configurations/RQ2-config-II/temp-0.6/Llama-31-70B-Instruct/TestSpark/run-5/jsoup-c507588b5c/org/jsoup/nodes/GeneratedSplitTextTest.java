package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedSplitTextTest {

    // Testing constructor

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        assertThat(textNode.splitText(1), notNullValue());
    }

}