package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestMultipleTags {

    @Test
    public void testMultipleTags() {
        String htmlString = "<p><span> Hello </span> <span> world</span></p>";
        String expectedHtml = "<p>Hello <span> world</span></p>";

        MyParser parser = new MyParser();
        String actualHtml = parser.parse(htmlString);

        assertThat(actualHtml, is(expectedHtml));
    }

}