package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedNodeName {

    @Test
    public void nodeName() {
        Document document = new Document("");
        String expectedName = "HTML";
        String actualName = document.nodeName();
        assertThat(actualName, is(expectedName));
    }

}