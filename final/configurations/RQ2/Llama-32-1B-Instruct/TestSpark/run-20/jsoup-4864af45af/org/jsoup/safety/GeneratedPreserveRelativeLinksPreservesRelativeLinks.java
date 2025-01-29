package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.jupiter.api.BeforeEach;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedPreserveRelativeLinksPreservesRelativeLinks {

    @Mock
    private Validate validate;

    private Safelist instance;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        instance = new Safelist();
    }

    @Test
    public void preserveRelativeLinksPreservesRelativeLinks() {
        // Arrange
        Safelist safelist = new Safelist();
        safelist.addTags("a", "img");
        // Act
        Safelist result = instance;
        // Assert
        assertTrue(result.getTags().containsAll(safelist.getTags()));
    }

}