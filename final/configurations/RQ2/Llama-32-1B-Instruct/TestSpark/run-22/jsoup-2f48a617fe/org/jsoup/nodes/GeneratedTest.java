package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTest {

    public static void testNodeName() {
        String expected = "Comment";
        Element comment = new Comment().outerHtmlHead(parserSettings, 0, null).join();
        assertEquals(expected, comment.toString());
    }

    @Test
    public void testGetData() {
        String expected = "This is a test";
        Element comment = new Comment("This is a test").toString();
        assertEquals(expected, comment);
    }

    @Test
    public void test

    setData() {
        Element comment = new Comment().outerHtmlHead(parserSettings, 0, null).join();
        comment.outerHtmlHead(parserSettings, 0, null).setData("");
        String expected = "This is a test";
        assertEquals(expected, comment.toString());
    }

    @Test
    public void test_outerHtmlHead() throws IOException {
        Document document = new Document();
        Element root = new Comment().outerHtmlHead(parserSettings, 0, null).join();
        assertEquals("<Comment>", root.outerHtml);
    }

    @Test
    public void test_outerHtmlTail() throws IOException {
        Document document = new Document();
        Element root = new Comment().outerHtmlHead(parserSettings, 0, null).join();
        String expected = "<Comment>";
        element = new Comment(root.toString()).outerHtmlHead(parserSettings, 0, null);
        assertEquals(expected, element.outerHtml);
    }

    @Test
    public void testToString() {
        Element comment = new Comment("This is a test").toString();
        assertEquals("This is a test", comment);
    }

    @Test
    public void testNodeName() {
        String expected = "Comment";
        TextNode node = (TextNode) new Comment().outerHtmlHead(parserSettings, 0, null).join().text().trim();
        assertEquals(expected, node.text());
    }
}

@Test
public void testGetData() {
    String expected = "This is a test";
    TextNode node = (TextNode) new Comment("This is a test").outerHtmlHead(parserSettings, 0, null).join().text();
    assertEquals(expected, node.text());
}
	}

@Test
public void test_outerHtmlHead() throws IOException {
    Document document = new Document();
    Element root = (Element) new Comment().outerHtmlHead(parserSettings, 0, null).join();
    assertEquals("<Comment>", root.outerHtml);
}
	}

@Test
public void testAsXmlDeclaration() {
    String expected = "<!DOCTYPE html><body>Hello World!</body></html>";
    XmlDeclaration xmlDecl = (XmlDeclaration) new Comment("<!DOCTYPE html><body>Hello World!</body></html>").asXmlDeclaration();
    assertEquals(expected, xmlDecl.toString());
}
	}

@Test
public void test_asXmlDeclaration() {
    String expected = "<!DOCTYPE html><body>Hello World!</body></html>";
    XmlDeclaration xmlDecl = (XmlDeclaration) new Comment("<!DOCTYPE html><body>Hello World!</body></html>").asXmlDeclaration();
    assertEquals(expected, xmlDecl.toString());
}
	}

@Test
public void test_outerHtmlTail() throws IOException {
    Document document = new Document();
    Element root = (Element) new Comment().outerHtmlHead(parserSettings, 0, null).join();
    String expected = "<Comment>";
    element = new Comment(root.toString()).outerHtmlHead(parserSettings, 0, null);
    assertEquals(expected, element.outerHtml);
}
	}

@Test
public void test_outerHtmlHead() throws IOException {
    Document document = new Document();
    Element root = (Element) new Comment().outerHtmlHead(parserSettings, 0, null).join();
    String expected = "<Comment>";
    element = new Comment(root.toString()).outerHtmlHead(parserSettings, 0, null);
    assertEquals(expected, element.outerHtml);
}
		}

private static ParseSettings parserSettings = new ParseSettings();

public static void main(String[] args) {
    TestSpark.run();
}

}