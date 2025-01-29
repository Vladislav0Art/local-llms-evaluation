package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void testText() {
        String text = "<p>Hello World!</p>";
        Element element = parser.parseString(text);
        assertTrue(element.getTextContent().isEmpty());
        element.setTextContent("Hello World!");
        assertTrue(element.getTextContent().equals("Hello World!"));
    }

    @Test
    public void testWholeText() {
        String text = "<p>Hello World!</p><span>This is a test</span>";
        Element element = parser.parseString(text);
        String wholeText = element.getWholeText();
        assertTrue(wholeText.contains("<p>Hello World!</p>"));
    }

    @Test
    public void testWholeOwnText() {
        String text = "<p>Hello World!</p><span>This is a test</span>";
        Element element = parser.parseString(text);
        String wholeOwnText = element.getWholeOwnText();
        assertTrue(wholeOwnText.contains("<p>Hello World!</p>"));
    }

    @Test
    public void testOwnText() {
        String text = "<p>Hello World!</p><span>This is a test</span>";
        Element element = parser.parseString(text);
        boolean ownText = element.getOwnText().isEmpty();
        assertTrue(ownText);
    }

    @Test
    public void testData() {
        String data = "Hello, <script>alert('XSS')</script>";
        Element element = parser.parseString(data);
        assertTrue(element.getData().equals("Hello, <script>alert('XSS')</script>"));
    }

    @Test
    public void testClassNames() {
        String text = "<p class='test-class'>Hello World!</p>";
        Element element = parser.parseString(text);
        Set<String> classNames = new java.util.HashSet<>();
        classNames.add("test-class");
        assertTrue(classNames.containsAll(element.getClassNameSet()));
    }

    @Test
    public void testCssSelector() {
        String cssSelector = "p";
        Element element = parser.parseString("<p>Hello World!</p>");
        assertTrue(element.getCssSelector().contains(cssSelector));
    }

    @Test
    public void testShouldIndent() {
        Document.OutputSettings out = new Document.OutputSettings();
        out.setIndentSize(4);
        String html = "<p>Hello World!</p>";
        Element element = parser.parseString(html, out);
        assertTrue(element.outerHtmlHead(new java.util.Arrays.asList(), 0, out).contains(" <pre>"));
    }

    @Test
    public void testOuterHtmlTail() {
        Document.OutputSettings out = new Document.OutputSettings();
        out.setIndentSize(4);
        String html = "<p>Hello World!</p>";
        Element element = parser.parseString(html, out);
        assertTrue(element.outerHtmlTail(new java.util.Arrays.asList(), 0, out).contains("<body></body>"));
    }

    @Test
    public void testRoot() {
        Document document = new Document();
        Element root = document.createElement("html");
        document.appendChild(root);
        String html = "<head><title>Hello World!</title></head><body>Hello World!</body>";
        parser.parseString(html, root);
        assertTrue(root.hasChildNodes());
    }

    @Test
    public void testTraverse() {
        Document document = new Document();
        Element element = document.createElement("html");
        document.appendChild(element);
        String html = "<p>Hello World!</p><span>This is a test</span>";
        parser.parseString(html, element);
        assertTrue(element.traverse(new java.util.function.Consumer<Element>() {
            @Override
            public void accept(Element node) {
                System.out.println(node.getTagName());
            }
        }));
    }

    @Test
    public void testForEachNode() {
        Document document = new Document();
        Element root = document.createElement("html");
        document.appendChild(root);
        String html = "<p>Hello World!</p><span>This is a test</span>";
        parser.parseString(html, root);
        assertTrue(document.getInnerHTML().contains("<p>Hello World!</p>"));
    }

    @Test
    public void testForEach() {
        Document document = new Document();
        Element element = document.createElement("html");
        document.appendChild(element);
        String html = "<p>Hello World!</p>";
        parser.parseString(html, element);
        assertTrue(document.getInnerHTML().contains("<span>This is a test</span>"));
    }

    @Test
    public void testFilter() {
        Document document = new Document();
        Element root = document.createElement("html");
        document.appendChild(root);
        String html = "<p>Hello World!</p><span>This is a test</span>";
        parser.parseString(html, root);
        assertTrue(document.getInnerHTML().contains("<p>Hello World!</p>"));
    }

}