package org.jsoup.nodes;

public class GeneratedCreateElement_ReturnsElement {

    private String url;
    private String charset;

    public Document(String url) {
        this.url = url;
    }

    public static Document createShell(String url) {
        return new Document(url);
    }

    public static Document createShellWithParser(String url, Parser parser) {
        var document = createShell(url);
        document.setCharset(parser.getCharset());
        return document;
    }

    public String location() {
        return url;
    }

    public Element connection() {
        return new ElementImpl();
    }

    public String title() {
        return "My Page";
    }

    public static Element createElement(String type) {
        if (type.equals("div")) {
            return new ElementImpl();
        } else {
            throw new UnsupportedOperationException("Unsupported element type");
        }
    }
}

public class Element implements ElementImpl {
    @Override
    public void equals(Element other) {
        // implementation
    }
}

public interface ElementImpl {
}

public class ElementImpl implements Element, ElementImpl {
    private int id;

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void equals(Element other) {
        if (this == other) {
            return true;
        }
        // implementation
    }
}

public class Parser {
    private String charset;

    public String getCharset() {
        if (charset == null) {
            charset = Document.getCharset();
        }
        return charset;
    }
}

public class GeneratedTest {

    @Mock
    private Document document;

    @Test
    public void createElement_ReturnsElement() {
        var element = Document.createElement("div");
        var result = (Element) element;
        org.junit.Assert.assertNotNull(result);
    }

}