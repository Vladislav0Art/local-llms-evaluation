package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsXmlDeclaration_dataStartsWithExclamationOrQuestionMark_returnsTrue {

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
    public void isXmlDeclaration_dataStartsWithExclamationOrQuestionMark_returnsTrue() {
        Comment comment = new Comment("!data");
        assertTrue(comment.isXmlDeclaration());
    }

}