package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateElementInvalidTagName {

    @Test
    public void createElementInvalidTagName() {
        Document document = new Document("");
        document.createElement("-tag");
    }

}