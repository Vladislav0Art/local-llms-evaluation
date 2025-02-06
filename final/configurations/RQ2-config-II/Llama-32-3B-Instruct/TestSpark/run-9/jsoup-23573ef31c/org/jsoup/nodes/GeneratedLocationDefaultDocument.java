package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedLocationDefaultDocument {

    @Test
    public void locationDefaultDocument() {
        Document document = new Document("");
        assert document.location().equals("");
    }

}