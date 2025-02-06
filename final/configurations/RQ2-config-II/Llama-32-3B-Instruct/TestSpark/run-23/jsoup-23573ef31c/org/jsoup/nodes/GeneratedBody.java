package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedBody {

    @Test
    public void body() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        Element bodyElement = document.body();
        assertThat(bodyElement, is(notNullValue()));
    }

}