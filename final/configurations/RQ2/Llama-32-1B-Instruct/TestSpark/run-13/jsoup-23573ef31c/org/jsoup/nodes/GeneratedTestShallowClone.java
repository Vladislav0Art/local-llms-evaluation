package org.jsoup.nodes;

public class GeneratedTestShallowClone {

    private Document document;

    @Before
    public void setup() {
        document = new Document("http://example.com");
    }

    public void testCreateShell() {
        String baseUri = "http://example.com";
        Document shell = Document.createShell(baseUri);
        assertEquals(baseUri, shell.location());
    }

    public void testConnection() {
        Connection connection = document.connection();
        assertNotNull(connection);
        assertEquals("http://example.com", connection.getUri());
    }

    public void testTitle() {
        String title = "My Title";
        document.title(title);
        assertEquals(title, document.title().toString());
    }

    public void testHead() {
        Element head = document.head();
        assertNotNull(head);
        assertEquals("http://example.com/html", head.getAttribute("href"));
        assertEquals(0, head.length());
    }

    public void testBody() {
        List<FormElement> forms = document.forms();
        assertNotNull(forms);
        assertEquals(2, forms.size());
    }

    public void testExpectForm() {
        String cssQuery = ".my-class";
        Element element = document.expectForm(cssQuery);
        assertNotNull(element);
        assertEquals(".my-class", element.attr("class"));
    }

    public void testTitleWithSpaces() {
        String title = "My Title With Spaces";
        document.title(title);
        assertEquals(title, document.title().toString());
    }

    @Test
    public void testShallowClone() {
        Element root = document.head();
        Element clone = document.shallowClone();
        assertNotNull(clone);
        assertEquals(root, clone);
    }

}