package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;

public class GeneratedTestGetBaseUri {

    @Test
    public void testGetBaseUri() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        String baseUri = "/test";
        assertEquals(baseUri, builder.getBaseUri());
    }
}

class Parser {
    public Document parse(String text, Element context, String baseUri) {
        // implementation of the parser
    }

    public String getBaseUri() {
        return "";
    }
}

class Node {
    public String text;
}

public class HtmlTreeBuilder {

    public List<Node> parseFragment(String input, Element context, String baseUri, Parser parser) throws Exception {
        Document document = Jsoup.parse(input);
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.parseFragment("<p>Hello World!</p>", null, "/test", new Parser());
    }

}