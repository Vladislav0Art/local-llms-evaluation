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
public class GeneratedCharsetMethod_withValidCharsetSetsCharsetProperty {

    @Mock
    private Parser parser;

    @Mock
    private QuirksMode quirksMode;

    @Mock
    private Connection connection;

    @Test
    public void charsetMethod_withValidCharsetSetsCharsetProperty() {
        // Arrange
        Charset charset = Charset.forName("UTF-8");

        // Act
        Document document = new Document("https://www.example.com");
        document.charset(charset);

        // Assert
        assertEquals(charset, document.charset());
    }

}