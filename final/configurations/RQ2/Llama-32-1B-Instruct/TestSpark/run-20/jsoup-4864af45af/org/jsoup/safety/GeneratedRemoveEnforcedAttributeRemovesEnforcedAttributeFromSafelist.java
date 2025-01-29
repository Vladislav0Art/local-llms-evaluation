package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.jupiter.api.BeforeEach;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedRemoveEnforcedAttributeRemovesEnforcedAttributeFromSafelist {

    @Mock
    private Validate validate;

    private Safelist instance;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        instance = new Safelist();
    }

    @Test
    public void removeEnforcedAttributeRemovesEnforcedAttributeFromSafelist() {
        // Arrange
        String tag = "p";
        Safelist safelist = new Safelist();
        Safelist result = instance;
        result.removeEnforcedAttribute(tag);
        // Act
        Safelist newSafelist = result;
        // Assert
        assertTrue(newSafelist.getEnforcedAttributes().isEmpty());
    }

}