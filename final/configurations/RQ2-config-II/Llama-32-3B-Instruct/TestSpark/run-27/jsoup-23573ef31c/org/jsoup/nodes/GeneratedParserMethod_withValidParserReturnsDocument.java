package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.Validate.assertValidUri;
import static org.jsoup.select.Elements.select;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParserMethod_withValidParserReturnsDocument {

    @Mock
    private Parser parser;

    @Mock
    private QuirksMode quirksMode;

    @Mock
    private Connection connection;

    @Test
    public void parserMethod_withValidParserReturnsDocument() {
        // Arrange
        Parser parserValue = Mockito.mock(Parser.class);

        // Act
        Document document = new Document("https://www.example.com");
        document.parser(parserValue);

        // Assert
        assertNotNull(document);
    }

}