package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    public static String asXmlDeclaration(String xml) {
        return "<!DOCTYPE root PUBLIC \"-//jsoup.org/HTML Dolittle 5.1;\" \"http://jsoup.org/xml/dolittle-5.1\"><root>" + xml + "</root>";
    }

    public boolean isXmlDeclarationData(String xml) {
        return asXmlDeclaration(xml).contains("value");
    }
}

public class TestCommentClass {

}