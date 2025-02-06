package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedTitleSet {

    @Test
    public void titleSet() {
        String expectedTitle = "Example Title";
        Document document = new Document("");
        document.title(expectedTitle);
        String actualTitle = document.title();
        assertThat(actualTitle, is(expectedTitle));
    }

}