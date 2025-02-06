package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedOuterHtml {

    @Test
    public void outerHtml() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = Jsoup.parse(html);
        String actualOuterHtml = document.outerHtml();
        assertThat(actualOuterHtml, is(html));
    }

}