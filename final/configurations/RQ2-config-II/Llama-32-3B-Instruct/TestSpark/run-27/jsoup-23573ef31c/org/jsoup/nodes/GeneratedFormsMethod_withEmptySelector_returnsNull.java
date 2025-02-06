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
public class GeneratedFormsMethod_withEmptySelector_returnsNull {

    @Mock
    private Parser parser;

    @Mock
    private QuirksMode quirksMode;

    @Mock
    private Connection connection;

    @Test
    public void formsMethod_withEmptySelector_returnsNull() {
        // Arrange
        String cssQuery = "";

        // Act
        List<FormElement> forms = Document.forms(cssQuery);

        // Assert
        assertTrue(forms == null);
    }

}