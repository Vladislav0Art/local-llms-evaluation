package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestMultipleSpaces {

    @Test
    public void testMultipleSpaces() {
        String htmlString = " <span> Hello   world  </span>";
        String expectedHtml = "<span>Hello world</span>";

        MyParser parser = new MyParser();
        String actualHtml = parser.parse(htmlString);

        assertThat(actualHtml, is(expectedHtml));
    }

}