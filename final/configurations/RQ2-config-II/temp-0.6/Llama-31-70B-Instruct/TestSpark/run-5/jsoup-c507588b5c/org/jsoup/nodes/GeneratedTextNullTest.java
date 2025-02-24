package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedTextNullTest {

    // Testing constructor

    @Test
    public void textNullTest() {
        TextNode textNode = new TextNode("test");
        textNode.text(null);
    }

}