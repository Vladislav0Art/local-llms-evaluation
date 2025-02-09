package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Connection connection;

    public Document document = new Document("https://www.example.com");

    @Test
    public void createShell_StringReturnsDocument() {
        Document createdDocument = Document.createShell("https://www.example.com");
        org.junit.Assert.assertNotNull(createdDocument);
    }

    @Test
    public void createShell_NullStringThrowsException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> Document.createShell(null));
    }

    @Test
    public void location_ReturnsEmptyString() {
        String location = document.location();
        org.junit.Assert.assertEquals("", location);
    }

    @Test
    public void location_NonEmptyStringReturnsLocation() {
        String location = document.location();
        org.junit.Assert.assertNotEquals("", location);
    }

    @Test
    public void connection_ReturnsConnectionObject() {
        Connection returnedConnection = document.connection();
        org.junit.Assert.assertNotNull(returnedConnection);
    }

    @Test
    public void createElement_SingleCharacterReturnsCorrectHtml() {
        Element element = new Document("https://www.example.com").text("a");
        org.junit.Assert.assertEquals("<a>", element.outerHtml());
    }

}