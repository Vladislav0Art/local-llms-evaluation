package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestSimpleTags {

    @Test
    public void testSimpleTags() {
        String htmlString = "<p>Hello world!</p>";
        String expectedHtml = "<p>Hello world</p>";

        MyParser parser = new MyParser();
        String actualHtml = parser.parse(htmlString);

        assertThat(actualHtml, is(expectedHtml));
    }

}