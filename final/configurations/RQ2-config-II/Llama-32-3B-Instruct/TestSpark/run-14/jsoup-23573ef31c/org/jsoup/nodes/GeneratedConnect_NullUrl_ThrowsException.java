package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedConnect_NullUrl_ThrowsException {

    @Test
    public void connect_NullUrl_ThrowsException() {
        String url = null;
        assertThrows(NullPointerException.class, () -> Jsoup.connect(url));
    }
}

public class DocumentTypeTest {

    private static class MockDocumentType extends DocumentType {
        @Override
        public String name() {
            return "Mock Name";
        }

        @Override
        public String version() {
            return "Mock Version";
        }
    }

}