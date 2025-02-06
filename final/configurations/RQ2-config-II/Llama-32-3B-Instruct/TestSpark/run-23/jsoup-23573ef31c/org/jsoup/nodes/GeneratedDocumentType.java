package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedDocumentType {

    @Test
    public void documentType() {
        Document document = new Document("");
        Document.Type type = document.documentType();
        assertThat(type, is(Document.Type.None));
    }

}