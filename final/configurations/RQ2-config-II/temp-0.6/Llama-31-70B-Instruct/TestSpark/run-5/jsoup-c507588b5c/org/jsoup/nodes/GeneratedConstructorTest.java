package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedConstructorTest {

    // Testing constructor

    @Test
    public void constructorTest() {
        TextNode textNode = new TextNode("test");
        assertThat(textNode, notNullValue());
    }

}