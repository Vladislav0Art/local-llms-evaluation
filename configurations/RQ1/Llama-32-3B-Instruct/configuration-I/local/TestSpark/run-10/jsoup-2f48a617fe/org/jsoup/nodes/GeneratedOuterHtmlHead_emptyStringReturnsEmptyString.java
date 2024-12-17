package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlHead_emptyStringReturnsEmptyString {

    @BeforeClass
    public static void setup() {
        // Initialize mocks for Parser and Document
        Parser parser = Mockito.mock(Parser.class);
        Document document = new Document();

        // Create a mock BaseUri
        String baseUriMock = "mock:baseUri";
        org.jsoup.nodes.BaseUri baseUriMockObj = Mockito.mock(org.jsoup.nodes.BaseUri.class);
        when(baseUriMockObj.toExternalForm()).thenReturn(baseUriMock);

        // Mock the parser with the settings and parse input
        when(parser.settings(Mockito.any(ParseSettings.class))).thenReturn(document);
    }

    @Test
    public void outerHtmlHead_emptyStringReturnsEmptyString() {
        LeafNode node = new LeafNode("");
        String result = "";
        try {
            StringBuilder sb = new StringBuilder();
            node.outerHtmlHead(sb, 0, null);
            assertEquals(result, sb.toString());
        } catch (IOException e) {
        }
    }

}