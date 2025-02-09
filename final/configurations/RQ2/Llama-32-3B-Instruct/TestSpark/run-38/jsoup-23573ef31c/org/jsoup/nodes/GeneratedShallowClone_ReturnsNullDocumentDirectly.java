package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedShallowClone_ReturnsNullDocumentDirectly {

    @Test
    public void shallowClone_ReturnsNullDocumentDirectly() {
        Document document = new Document("");
        Document nullDocument = document.shallowClone();
        assertNull(nullDocument);
    }

}