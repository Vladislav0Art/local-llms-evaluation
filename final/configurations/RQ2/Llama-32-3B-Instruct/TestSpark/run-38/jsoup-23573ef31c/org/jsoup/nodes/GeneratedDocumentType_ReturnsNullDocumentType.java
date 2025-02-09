package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedDocumentType_ReturnsNullDocumentType {

    @Test
    public void documentType_ReturnsNullDocumentType() {
        Document document = new Document("");
        assertNull(document.documentType());
    }

}