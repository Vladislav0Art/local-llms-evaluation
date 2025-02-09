package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateShell_StringReturnsDocument {

    @Mock
    private Connection connection;

    public Document document = new Document("https://www.example.com");

    @Test
    public void createShell_StringReturnsDocument() {
        Document createdDocument = Document.createShell("https://www.example.com");
        org.junit.Assert.assertNotNull(createdDocument);
    }

}