package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.jsoup.Jsoup.connect;

public class GeneratedCreateShell_ReturnsNonNullDocument {

    private Connection connectionMock = Mockito.mock(Connection.class);

    @Test
    public void createShell_ReturnsNonNullDocument() {
        Document document = Document.createShell("https://example.com");
        assertNotNull(document);
    }

}