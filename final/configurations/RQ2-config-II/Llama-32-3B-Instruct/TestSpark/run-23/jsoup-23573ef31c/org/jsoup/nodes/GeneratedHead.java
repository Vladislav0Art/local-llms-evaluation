package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedHead {

    @Test
    public void head() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        Element headElement = document.head();
        assertThat(headElement, is(notNullValue()));
    }

}