package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.jupiter.api.BeforeEach;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedBasicWithImages_isSafeTag_ReturnsTrue {

    @Mock
    private Validate validate;

    private Safelist instance;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        instance = new Safelist();
    }

    @Test
    public void basicWithImages_isSafeTag_ReturnsTrue() {
        // Arrange
        String tag = "img";
        // Act
        boolean result = instance.isSafeTag(tag);

        // Assert
        assertTrue(result);
    }

}