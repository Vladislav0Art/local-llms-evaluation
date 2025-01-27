package org.jsoup.nodes;

public class GeneratedTest {

    private String url;

    public static Document createShell(String url) {
        return new Document(url);
    }

    public String getCharset() {
        // implementation
        return "";
    }
}

public interface Element {
}

public class ElementImpl implements Element {
    @Override
    public void equals(Element other) {
        if (this == other) {
            return true;
        }
        // implementation
    }
}

public class GeneratedTest {

    @Mock
    private Document document;

    @Test
    public void createShell_Matches() {
        Mockito.when(element.toString()).thenReturn("<html></html>");
        var result = Document.createShell("https://example.com");
        Mockito.verify(element).toString();
    }

}