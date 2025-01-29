package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTest {

    @Test
    public void testParse() {
        String htmlString = "<p>Hello, <span>world!</span></p>";
        String expectedHtml = "<p>Hello, <span>world!</span></p>";

        MyParser parser = new MyParser();
        String actualHtml = parser.parse(htmlString);

        assertThat(actualHtml, is(expectedHtml));
    }

    @Test
    public void testNoText() {
        String htmlString = "<div>Hello, world!</div>";
        String expectedHtml = "";

        MyParser parser = new MyParser();
        String actualHtml = parser.parse(htmlString);

        assertThat(actualHtml, is(expectedHtml));
    }

    @Test
    public void testEmptyString() {
        String htmlString = "";
        String expectedHtml = "";

        MyParser parser = new MyParser();
        String actualHtml = parser.parse(htmlString);

        assertThat(actualHtml, is(expectedHtml));
    }

    @Test
    public void testNoContent() {
        String htmlString = "<p></p>";
        String expectedHtml = "</p>";

        MyParser parser = new MyParser();
        String actualHtml = parser.parse(htmlString);

        assertThat(actualHtml, is(expectedHtml));
    }

    @Test
    public void testMultipleSpaces() {
        String htmlString = " <span> Hello   world  </span>";
        String expectedHtml = "<span>Hello world</span>";

        MyParser parser = new MyParser();
        String actualHtml = parser.parse(htmlString);

        assertThat(actualHtml, is(expectedHtml));
    }

    @Test
    public void testMultipleTags() {
        String htmlString = "<p><span> Hello </span> <span> world</span></p>";
        String expectedHtml = "<p>Hello <span> world</span></p>";

        MyParser parser = new MyParser();
        String actualHtml = parser.parse(htmlString);

        assertThat(actualHtml, is(expectedHtml));
    }

    @Test
    public void testMultipleTagTypes() {
        String htmlString = "<span><p>Hello</p></span>";
        String expectedHtml = "<span>Hello<p> world</p></span>";

        MyParser parser = new MyParser();
        String actualHtml = parser.parse(htmlString);

        assertThat(actualHtml, is(expectedHtml));
    }

    @Test
    public void testSimpleTags() {
        String htmlString = "<p>Hello world!</p>";
        String expectedHtml = "<p>Hello world</p>";

        MyParser parser = new MyParser();
        String actualHtml = parser.parse(htmlString);

        assertThat(actualHtml, is(expectedHtml));
    }

}