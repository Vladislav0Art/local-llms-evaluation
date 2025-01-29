package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testElement() {
        // Arrange
        String uri = BASE_URI + "/test.html";
        Element document = new Document(uri);

        // Act
        Elements elements = document.elements();

        // Assert
        assertEquals(1, elements.size());
        assertNotEmpty(elements);
    }

    @Test
    public void testElements() {
        // Arrange
        String uri = BASE_URI + "/example.html";

        // Act
        List<Element> elements = new ArrayList<>();
        for (Element element : document.forms()) {
            elements.add(element);
        }
        Collections.sort(elements, Comparator.comparingInt(a -> a.tagName()));
        assertNotEmpty(elements);

        // Assert
        assertEquals(1, elements.size());
    }

    @Test
    public void testText() {
        // Arrange
        String uri = BASE_URI + "/test.html";
        Element document = new Document(uri);

        // Act
        String text = document.text("test");

        // Assert
        assertEquals("test", text);
    }

    @Test
    public void testNameNode() {
        // Arrange
        String uri = BASE_URI + "/test.html";
        Element document = new Document(uri);

        // Act
        String nodeName = document.nodeName();

        // Assert
        assertEquals("test", nodeName);
    }
}

class DocumentParser {

    private final Parser parser;

    public DocumentParser(String baseUri) {
        this.parser = new DocumentParser(baseUri);
    }

    public Element parse(String html) {
        return parser.parse(html);
    }

    @Override
    public String toString() {
        return "<parser>";
    }
}

class ParserTest {

    private final DocumentParser parser;

    public ParserTest(DocumentParser parser) {
        this.parser = parser;
    }

    @Test
    public void testParse() {
        // Arrange
        String html = "test";
        Element element = parser.parse(html);

        // Act
        Document document = new Document();
        document.appendChild(element);
        assertNotEmpty(document.elements());

        // Assert
        assertEquals(1, document.elements().size());
    }

    @Test
    public void testParseString() {
        // Arrange
        String html = "test";
        Element element = parser.parse(html);

        // Act
        Document document = new Document();
        document.appendChild(element);
        assertNotEmpty(document.elements());

        // Assert
        assertEquals(1, document.elements().size());
    }

    @Test
    public void testParseLines() {
        // Arrange
        String html = "\ntest\n";
        Element element = parser.parse(html);

        // Act
        Document document = new Document();
        document.appendChild(element);
        assertNotEmpty(document.elements());

        // Assert
        assertEquals(1, document.elements().size());
    }
}

class DocumentParserTest {

    private final Parser parser;

    public DocumentParserTest(Parser parser) {
        this.parser = parser;
    }

    @Test
    public void testParse() {
        // Arrange
        String html = "test";
        Element element = parser.parse(html);

        // Act
        Document document = new Document();
        document.appendChild(element);
        assertNotEmpty(document.elements());

        // Assert
        assertEquals(1, document.elements().size());
    }

    @Test
    public void testParseString() {
        // Arrange
        String html = "test";
        Element element = parser.parse(html);

        // Act
        Document document = new Document();
        document.appendChild(element);
        assertNotEmpty(document.elements());

        // Assert
        assertEquals(1, document.elements().size());
    }

    @Test
    public void testParseLines() {
        // Arrange
        String html = "\ntest\n";
        Element element = parser.parse(html);

        // Act
        Document document = new Document();
        document.appendChild(element);
        assertNotEmpty(document.elements());

        // Assert
        assertEquals(1, document.elements().size());
    }

    @Test
    public void testParseStringOnMultipleLines() {
        // Arrange
        String html = "\n\ntest";
        Element element = parser.parse(html);

        // Act
        Document document = new Document();
        document.appendChild(element);
        assertNotEmpty(document.elements());

        // Assert
        assertEquals(1, document.elements().size());
    }

}