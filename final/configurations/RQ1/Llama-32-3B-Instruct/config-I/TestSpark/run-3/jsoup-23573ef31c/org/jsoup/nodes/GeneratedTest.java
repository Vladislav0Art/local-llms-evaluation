package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testJsoupCreateDocument() {
        String html = "<html>content</html>";
        Document document = Document.createDocument(html, null);
        assert document != null;
    }

    @Test
    public void testJsoupParseString() {
        String html = "<p>Hello World!</p>";
        Document document = Jsoup.parse(html);
        System.out.println(document.toString());
    }

    @Test
    public void testJsoupBuildDocument() {
        DocumentBuilder builder = new DocumentBuilder();
        Connection connection = null;
        Document document = builder.document().build(connection);
        assert document != null;
    }
}

class DocumentBuilder {
    public Document build(Connection connection) {
        return Document.createDocument("<html>content</html>", Parser.createParser("parser"));
    }
}

class Parser {
    public static Parser createParser(String parser) {
        return new Parser();
    }

    public String toString() {
        return "parser";
    }

    public Object hash() {
        return "parser";
    }
}

}