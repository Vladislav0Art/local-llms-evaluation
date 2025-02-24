package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

    // Testing constructor

    @Test
    public void constructorTest() {
        TextNode textNode = new TextNode("test");
        assertThat(textNode, notNullValue());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        assertThat(textNode.nodeName(), is("#text"));
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("test");
        assertThat(textNode.text(), is("test"));
    }

    @Test
    public void textNullTest() {
        TextNode textNode = new TextNode("test");
        textNode.text(null);
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("test");
        assertThat(textNode.getWholeText(), is("test"));
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("test");
        assertThat(textNode.isBlank(), is(false));
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        assertThat(textNode.splitText(1), notNullValue());
    }

}