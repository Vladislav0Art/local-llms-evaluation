package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedTest {

    @Test
    public void newNodeTextIsEmpty() {
        TextNode node = new TextNode("");
        assertThat(node.text(), is(""));
    }

    @Test
    public void newNodeTextIsBlank() {
        TextNode node = new TextNode("   ");
        assertThat(node.isBlank(), is(true));
    }

    @Test
    public void newNodeTextNotBlank() {
        TextNode node = new TextNode("not blank");
        assertThat(node.isBlank(), is(false));
    }

    @Test
    public void cloneNewTextNode() {
        String text = "text";
        TextNode node1 = new TextNode(text);
        TextNode node2 = node1.clone();
        assertThat(node2.text(), is(text));
    }

    @Test
    public void getWholeTextReturnsOriginalText() {
        String text = "original text";
        TextNode node = new TextNode(text);
        assertThat(node.getWholeText(), is(text));
    }

    @Test
    public void toStringReturnsCorrectText() {
        String text = "text";
        TextNode node = new TextNode(text);
        assertThat(node.toString(), is("text"));
    }

    @Test
    public void toStringReturnsCorrectText() {
        String text = "text";
        TextNode node = new TextNode(text);
        assertThat(node.toString(), is(text));
    }

}