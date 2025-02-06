package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedTitle {

    @Test
    public void title() {
        Document document = new Document("");
        String title = document.title();
        assertThat(title, is(""));
    }

}