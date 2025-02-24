package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedTextTest {

    // Testing constructor

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("test");
        assertThat(textNode.text(), is("test"));
    }

}