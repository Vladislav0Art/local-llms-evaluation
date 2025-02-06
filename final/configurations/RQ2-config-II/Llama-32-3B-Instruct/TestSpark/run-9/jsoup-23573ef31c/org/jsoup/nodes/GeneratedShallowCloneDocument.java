package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedShallowCloneDocument {

    @Test
    public void shallowCloneDocument() {
        Document document = new Document("");
        Document clonedDocument = document.shallowClone();
        assert clonedDocument != null;
        assert clonedDocument.outerHtml().equals(document.outerHtml());
    }

}