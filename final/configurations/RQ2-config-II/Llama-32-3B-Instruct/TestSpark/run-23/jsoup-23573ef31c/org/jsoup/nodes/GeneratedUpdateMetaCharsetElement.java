package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedUpdateMetaCharsetElement {

    @Test
    public void updateMetaCharsetElement() {
        boolean expectedUpdate = true;
        Document document = new Document("");
        document.updateMetaCharsetElement(expectedUpdate);
        boolean actualUpdate = document.updateMetaCharsetElement();
        assertThat(actualUpdate, is(expectedUpdate));
    }

}