package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        assertThat(textNode.nodeName(), is("#text"));
    }

    @Test
    public void textGetValueTest() {
        TextNode textNode = new TextNode("test");
        assertThat(textNode.text(), is("test"));
    }

    @Test
    public void textSetValueTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("test2");
        assertThat(textNode.text(), is("test2"));
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("test");
        assertThat(textNode.getWholeText(), is("test"));
    }

    @Test
    public void isBlankTest_whenIsBlank() {
        TextNode textNode = new TextNode("   ");
        assertThat(textNode.isBlank(), is(true));
    }

    @Test
    public void isBlankTest_whenIsNotBlank() {
        TextNode textNode = new TextNode("test");
        assertThat(textNode.isBlank(), is(false));
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode secondNode = textNode.splitText(2);
        assertThat(textNode.getWholeText(), is("te"));
        assertThat(secondNode.getWholeText(), is("st"));
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(-1);
    }

    @Test
    public void splitTextExceedingOffsetTest() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(5);
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("test");
        TextNode clone = textNode.clone();
        assertThat(textNode.getWholeText(), equalTo(clone.getWholeText()));
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;p&gt;Paragraph&lt;/p&gt;");
        assertThat(textNode.getWholeText(), is("<p>Paragraph</p>"));
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = TextNode.normaliseWhitespace(" te st ");
        assertThat(text, is("te st"));
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = TextNode.stripLeadingWhitespace("  test");
        assertThat(text, is("test"));
    }

    @Test
    public void lastCharIsWhitespace_whenIsSpace() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("test "));
        assertThat(result, is(true));
    }

    @Test
    public void lastCharIsWhitespace_whenIsNotSpace() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("test"));
        assertThat(result, is(false));
    }

}