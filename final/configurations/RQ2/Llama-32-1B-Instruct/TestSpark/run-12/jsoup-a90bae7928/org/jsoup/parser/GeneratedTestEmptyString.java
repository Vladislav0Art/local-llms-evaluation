package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestEmptyString {

    @Test
    public void testEmptyString() {
        String htmlString = "";
        String expectedHtml = "";

        MyParser parser = new MyParser();
        String actualHtml = parser.parse(htmlString);

        assertThat(actualHtml, is(expectedHtml));
    }

}