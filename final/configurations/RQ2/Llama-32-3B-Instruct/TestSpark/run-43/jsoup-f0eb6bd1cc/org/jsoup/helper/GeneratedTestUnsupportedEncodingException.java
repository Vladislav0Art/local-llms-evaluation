package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestUnsupportedEncodingException {

    @Test
    public void testUnsupportedEncodingException() throws java.io.UnsupportedEncodingException {
        // Create a new URLBuilder and url with key-value pairs
        String baseUrl = "http://example.com/path?query=value";
        Document doc = Jsoup.parse(baseUrl);

        Element anchorTag = doc.select("a").first();
        anchorTag.attr("href", "http://example.com/path?query=hello");

        // Assert the URL after appending key-value pairs
        assert baseUrl.equals(anchorTag.attr("href"));
    }
}

public class Main {
    public static void main(String[] args) throws java.io.UnsupportedEncodingException {
        GeneratedTest generatedTest = new GeneratedTest();
        generatedTest.appendKeyVal_AddsKeyValueToExistingUrl();
        generatedTest.appendKeyVal_AddsKeyValueToExistingUrl2();
        generatedTest.testUnsupportedEncodingException();
    }

}