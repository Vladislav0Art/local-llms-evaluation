package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedLocation {

    @Test
    public void location() {
        Document document = new Document();
        assertThat(document.location(), null);
    }

}