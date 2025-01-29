package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    private Document document = new Document("");

    @Test
    public void testLocation() {
        when(document.location()).thenReturn("https://www.example.com");
        String result = document.location();
        assertEquals("https://www.example.com", result);
    }

    @Test
    public void testConnection() {
        Connection connection = mock(Connection.class);
        doReturn(connection).when(document.connection());
        Document result = document.connection();
        assertNotNull(result);
        verify(connection, times(1)).connection();
    }

    @Test
    public void testDocumentType() {
        when(document.documentType()).thenReturn(Document.DocumentType.PAGE);
        String result = document.documentType();
        assertEquals(Document.DocumentType.PAGE, result);
    }

    @Test
    public void testHead() {
        Element head = new DocumentElement("head");
        Elements result = document.head();
        assertTrue(result.contains(head));
        verify(head).createElement("head");
    }

    @Test
    public void testBody() {
        Element body = new DocumentElement("body");
        Elements result = document.body();
        assertTrue(result.contains(body));
        verify(body).createElement("body");
    }

    @Test
    public void testForms() {
        List<FormElement> forms = new ArrayList<>();
        when(document.forms()).thenReturn(forms);
        Elements result = document.forms();
        assertEquals(1, result.size());
        Element element = result.get(0);
        verify(element).expectForm("form-id");
    }

    @Test
    public void testTitle() {
        String title = "My Title";
        document.title(title);
        assertEquals(title, document.title());
    }

    @Test
    public void testCreateElement() {
        String tagName = "div";
        when(document.createElement(tagName)).thenReturn(createElement("div"));
        Document result = document.createElement(tagName);
        assertNotNull(result);
        verify(createElement(tagName)).createElement(tagName);
    }

}