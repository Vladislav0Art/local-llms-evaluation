package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestIsXmlDeclarationData {

    public static String asXmlDeclaration(String xml) {
        return "<!DOCTYPE root PUBLIC \"-//jsoup.org/HTML Dolittle 5.1;\" \"http://jsoup.org/xml/dolittle-5.1\"><root>" + xml + "</root>";
    }

    private String getTestString() {
        return "<root><element>value</element></root>";
    }
}

public class TestCommentClass {

    @Test
    public void testIsXmlDeclarationData() {
        assertEquals(true, new Comment().isXmlDeclarationData(getTestString()));
    }

}