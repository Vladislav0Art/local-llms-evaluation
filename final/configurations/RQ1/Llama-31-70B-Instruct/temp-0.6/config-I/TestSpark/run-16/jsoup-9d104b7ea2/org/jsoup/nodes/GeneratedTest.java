package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("text");
        assertThat(textNode.coreValue(), is("text"));
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("text");
        assertThat(textNode.nodeName(), is("#text"));
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("text");
        assertThat(textNode.text(), is("text"));
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("text");
        assertThat(textNode.getWholeText(), is("text"));
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());
        textNode = new TextNode(" ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("text");
        TextNode splittedTextNode = textNode.splitText(1);
        assertThat(textNode.coreValue(), is("t"));
        assertThat(splittedTextNode.coreValue(), is("ext"));
    }

}