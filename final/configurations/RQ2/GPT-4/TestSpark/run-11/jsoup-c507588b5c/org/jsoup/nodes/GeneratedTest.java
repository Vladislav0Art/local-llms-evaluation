package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        TextNode tn = new TextNode("sample");
        assertEquals("sample", tn.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode tn = new TextNode("sample");
        assertEquals("#text", tn.nodeName());
    }

    @Test
    public void textGetterTest() {
        TextNode tn = new TextNode("sample");
        assertEquals("sample", tn.text());
    }

    @Test
    public void textSetterTest() {
        TextNode tn = new TextNode("sample");
        tn.text("new sample");
        assertEquals("new sample", tn.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode tn = new TextNode("sample");
        assertEquals("sample", tn.getWholeText());
    }

    @Test
    public void isBlankTrueTest() {
        TextNode tn = new TextNode(" ");
        assertTrue(tn.isBlank());
    }

    @Test
    public void isBlankFalseTest() {
        TextNode tn = new TextNode("sample");
        assertFalse(tn.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("sample");
        TextNode tn2 = tn.splitText(2);
        assertEquals("sam", tn.text());
        assertEquals("ple", tn2.text());
    }

    @Test
    public void toStringTest() {
        TextNode tn = new TextNode("sample");
        assertEquals("sample", tn.toString());
    }

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("sample");
        TextNode clone = tn.clone();
        assertNotSame(tn, clone);
        assertEquals(tn.text(), clone.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode tn = TextNode.createFromEncoded("sam&amp;ple");
        assertEquals("sam&ple", tn.getWholeText());
    }

}