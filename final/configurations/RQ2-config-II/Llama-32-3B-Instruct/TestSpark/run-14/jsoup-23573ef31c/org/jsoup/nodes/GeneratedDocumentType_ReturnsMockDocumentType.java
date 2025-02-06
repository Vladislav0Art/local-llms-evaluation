package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedDocumentType_ReturnsMockDocumentType {

    @Test
    public void documentType_ReturnsMockDocumentType() {
        MockDocumentType mockDocumentType = new MockDocumentType();
        Document document = Document.createShell("");
        assertEquals(mockDocumentType, document.documentType());
    }
}

public class ParserTest {

    private static class MockParser extends Parser {
        private String content;

        @Override
        public void parse(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }
    }

}