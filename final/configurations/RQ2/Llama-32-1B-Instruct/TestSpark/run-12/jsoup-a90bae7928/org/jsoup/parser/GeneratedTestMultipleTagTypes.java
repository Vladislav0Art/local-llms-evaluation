package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestMultipleTagTypes {

    @Test
    public void testMultipleTagTypes() {
        String htmlString = "<span><p>Hello</p></span>";
        String expectedHtml = "<span>Hello<p> world</p></span>";

        MyParser parser = new MyParser();
        String actualHtml = parser.parse(htmlString);

        assertThat(actualHtml, is(expectedHtml));
    }

}