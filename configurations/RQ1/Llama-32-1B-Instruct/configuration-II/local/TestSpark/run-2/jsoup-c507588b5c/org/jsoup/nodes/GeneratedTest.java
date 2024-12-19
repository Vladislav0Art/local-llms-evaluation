package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    private Document document;
    private Appendable accum;
    private int depth = 0;
    private String text = "";

    public void setUp() {
        this.document = new Document();
        this.accum = new StringBuilder();
        this.depth = 0;
        this.text = "   Hello, World! ";
    }

    /**
     * Test if this text node is blank -- that is, empty or only whitespace (including newlines).
     */

    @Test
    public void testBlank() {
        TextNode result = new TextNode(this.text);
        assertThat(result.isBlank(), is(true));
    }

    @Test
    public void testGetWholeText() {
        TextNode result = new TextNode(this.text);
        List<String> expected = new ArrayList<>();
        expected.add("   Hello, World! ");
        assertThat(result.getWholeText(), is(expected));
    }

    @Test
    public void testText() {
        TextNode result = new TextNode(this.text);
        String expected = "Hello, World!";
        assertEquals(expected, result.text());
    }

    @Test
    public void testSplitText() {
        TextNode result = new TextNode(this.text).splitText(0);
        List<String> expected = new ArrayList<>();
        expected.add("Hello");
        expected.add("World!");
        assertThat(result.getWholeText(), is(expected));
    }

    @Test
    public void testOuterHtmlHead() {
        TextNode result = new TextNode(this.text).outerHtmlHead(null, 0, null);
        List<String> expected = new ArrayList<>();
        assertThat(expected, is(new String[]{"<div><p>Hello</p></div>}"));
	}

        @Test
        public void testOuterHtmlTail () {
            TextNode result = new TextNode(this.text).outerHtmlTail(null, 0, null);
            List<String> expected = new ArrayList<>();
            assertThat(expected, is(new String[]{"<p>Hello</p><p>World!</p>}"));
	}

            @Test
            public void testClone () {
                TextNode result = new TextNode(this.text).clone();
                List<String> expected = new ArrayList<>();
                expected.add("Hello");
                expected.add("World!");
                assertThat(result.getWholeText(), is(expected));
            }

            @Test
            public void testToString () {
                String expected = "<text>Hello, World!</text>";
                assertEquals(expected, new TextNode(this.text).toString());
            }

        }