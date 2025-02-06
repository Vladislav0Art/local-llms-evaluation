package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateElementValidTagName {

    @Test
    public void createElementValidTagName() {
        Document document = new Document("");
        Element element = document.createElement("div");
        assert element != null;
    }

}