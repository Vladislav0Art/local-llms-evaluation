package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestElementCreation {

    @Test
    public void testElementCreation() {
        Element element = Jsoup.parse("<p>This is a paragraph.</p>").body().first();
        assertThat(element.outerHtml(), is("<!-- <p>This is a paragraph.</p> -->"));
    }

}