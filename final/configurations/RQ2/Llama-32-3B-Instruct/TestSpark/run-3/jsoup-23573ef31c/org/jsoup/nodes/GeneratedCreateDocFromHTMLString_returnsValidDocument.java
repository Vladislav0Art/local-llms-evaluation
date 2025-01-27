package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.jsoup.Jsoup.connect;

public class GeneratedCreateDocFromHTMLString_returnsValidDocument {

    private Connection connectionMock = Mockito.mock(Connection.class);

    @Test
    public void createDocFromHTMLString_returnsValidDocument() throws Exception {
        String htmlString = "<html><body>Hello World!</body></html>";
        Document document = Document.parse(htmlString, ParseSettings.defaultSettings());
        assertNotNull(document);
    }

}