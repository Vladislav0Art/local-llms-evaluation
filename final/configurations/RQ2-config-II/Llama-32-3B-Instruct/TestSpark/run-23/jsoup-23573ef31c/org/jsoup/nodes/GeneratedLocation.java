package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedLocation {

    @Test
    public void location() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        String location = document.location();
        assertThat(location, is(""));
    }

}