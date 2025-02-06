package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedDocumentType_NullDocument_ReturnsNull {

    @Test
    public void documentType_NullDocument_ReturnsNull() {
        Document document = Document.createShell("");
        assertNull(document.documentType());
    }

}