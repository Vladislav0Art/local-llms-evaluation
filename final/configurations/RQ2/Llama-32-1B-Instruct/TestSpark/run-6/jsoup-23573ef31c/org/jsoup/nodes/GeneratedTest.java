package org.jsoup.nodes;

public class GeneratedTest {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void test_getLocation() {
        Document document = new Document(BASE_URI);
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void test_getConnection() {
        Connection connection = new Connection(BASE_URI);
        Document document = new Document(BASE_URI);
        document.setConnection(connection);
        assertEquals(connection, document.connection());
    }

    @Test
    public void test_getDocumentType() {
        String cssQuery = "/path/to/test/css";
        FormElement formElement = createFormElement(cssQuery, BASE_URI);
        Document document = new Document(BASE_URI).expectForm(formElement);
        assertEquals("text/html", document.documentType());
    }

    @Test
    public void test_title() {
        Document document = new Document(BASE_URI);
        document.setTitle("Example Title");
        assertEquals("Example Title", document.title());
    }

    @Test
    public void test_createElement() {
        String tagName = "example";
        Document document = new Document(BASE_URI);
        Element element = document.createElement(tagName);
        assertEquals(element, document.createElement(tagName));
    }

    @Test
    public void test_text() {
        Document document = new Document(BASE_URI);
        document.setText("Example Text");
        assertEquals(document.text("Example Text"), "Example Text");
    }

    @Test
    public void test_outerHtml() {
        Document document = new Document(BASE_URI);
        String html = "<html><body>Hello World!</body></html>";
        Document outputDocument = document.outerHtml(html);
        assertEquals("<html><body>Hello World!</body></html>", outputDocument.outerHtml());
    }

    @Test
    public void test_updateMetaCharsetElement() {
        Document document = new Document(BASE_URI);
        document.updateMetaCharsetElement(true);
        assertTrue(document.connection().metaCharsetElementUpdated());
    }

    @Test
    public void test_clone() {
        Document document = new Document(BASE_URI);
        Object clone = document.clone();
        assertEquals(document, (Document) clone);
    }

    @Test
    public void test_shallowClone() {
        Document document = new Document(BASE_URI);
        Object shallowClone = document.shallowClone();
        assertEquals(document, (Object) shallowClone);
    }
}

@Test
public void test_getTagName() {
    Element element = new Document(BASE_URI).createElement(TAG);
    assertEquals("example", element.getTagName());
}

@Test
public void test_getAttribute() {
    Document document = new Document(BASE_URI);
    element = document.createElement(TAG);
    assertEquals("", element.getAttribute("href"));
}

@Test
public void test_textSize() {
    Element element = new Document(BASE_URI).createElement(TAG);
    assertEquals(12, ((Text) element.getText()).getSize());
}
	}

@Test
public void test_expectForm() {
    FormElement formElement = createFormElement(CSS_QUERY, BASE_URI);
    Document document = new Document(BASE_URI).expectForm(formElement);
    assertEquals("text/html", document.documentType());
}

private static FormElement createFormElement(String cssQuery, String baseUri) {
    return new FormElement(BASE_URI, cssQuery);
}

}