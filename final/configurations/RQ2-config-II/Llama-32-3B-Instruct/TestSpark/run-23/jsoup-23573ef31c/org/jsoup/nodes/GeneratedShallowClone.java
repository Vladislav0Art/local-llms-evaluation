package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedShallowClone {

    @Test
    public void shallowClone() {
        Document document = new Document("");
        Document shallowClonedDocument = document.shallowClone();
        assertThat(shallowClonedDocument, is(notNullValue()));
    }

}