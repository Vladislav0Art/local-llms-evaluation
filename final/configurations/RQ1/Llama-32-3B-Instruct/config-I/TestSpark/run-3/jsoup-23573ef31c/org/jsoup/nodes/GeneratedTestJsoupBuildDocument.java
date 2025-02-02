package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestJsoupBuildDocument {

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