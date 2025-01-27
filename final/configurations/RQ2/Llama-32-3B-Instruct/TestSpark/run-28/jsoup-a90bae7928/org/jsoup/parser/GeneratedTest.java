package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    public Document buildDocument(String html) throws Exception {
        // implement your parsing logic here
        return new Document();
    }

    public void parse(String html, StringBuilder output) throws Exception {
        // implement your parsing logic here
    }
}

public class Element {
    private String tag;

    public String getTagName() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}

public class Document {
    private Element documentElement;

    public Element getDocumentElement() {
        return documentElement;
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TreeBuilderTest {

    @Test
    public void testBuildTree() throws Exception {
        HTMLParser parser = new HTMLParser();
        String html = "<html><body><div>Test</div></body></html>";
        Document document = parser.buildDocument(html);
        Element element = document.getDocumentElement();
        assertEquals("html", element.getTagName());
    }

}