package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedClone {

    @Test
    public void clone() {
        Document document = new Document("");
        Document clonedDocument = document.clone();
        assertThat(clonedDocument, is(notNullValue()));
    }

}