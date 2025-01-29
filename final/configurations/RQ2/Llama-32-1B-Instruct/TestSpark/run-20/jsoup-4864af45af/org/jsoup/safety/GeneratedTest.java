package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.jupiter.api.BeforeEach;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTest {

    @Mock
    private Validate validate;

    private Safelist instance;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        instance = new Safelist();
    }

    @Test
    public void none_isSafeTag_ReturnsFalse() {
        // Arrange
        String tag = "a";
        // Act
        boolean result = instance.isSafeTag(tag);

        // Assert
        assertFalse(result);
    }

    @Test
    public void simpleText_isSafeTag_ReturnsTrue() {
        // Arrange
        String tag = "p";
        // Act
        boolean result = instance.isSafeTag(tag);

        // Assert
        assertTrue(result);
    }

    @Test
    public void basic_isSafeTag_ReturnsTrue() {
        // Arrange
        String tag = "body";
        // Act
        boolean result = instance.isSafeTag(tag);

        // Assert
        assertTrue(result);
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

    @Test
    public void relaxed_isSafeTag_ReturnsFalse() {
        // Arrange
        String tag = "a";
        // Act
        boolean result = instance.isSafeTag(tag);

        // Assert
        assertFalse(result);
    }

    @Test
    public void copy_isSafeTag_ReturnsTrue() {
        // Arrange
        String tag = "p";
        // Act
        boolean result = instance.copy().isSafeTag(tag);

        // Assert
        assertTrue(result);
    }

    @Test
    public void addTagsAddsTagsToSafelist() {
        // Arrange
        String...tags = {"a", "img"};
        Safelist safelist = new Safelist();
        safelist.addTags(tags);
        // Act
        Safelist result = instance;
        // Assert
        assertTrue(result.getTags().containsAll(tags));
    }

    @Test
    public void removeTagsRemovesTagsFromSafelist() {
        // Arrange
        String...tags = {"a", "img"};
        Safelist safelist = new Safelist();
        safelist.addTags(tags);
        safelist.removeTags(tags[0]);
        // Act
        Safelist result = instance;
        // Assert
        assertTrue(result.getTags().isEmpty());
    }

    @Test
    public void addAttributesAddsAttributeToSafelist() {
        // Arrange
        String tag = "p";
        Safelist safelist = new Safelist();
        safelist.addAttributes(tag.toLowerCase(), "class", "text/plain");
        // Act
        Safelist result = instance;
        // Assert
        assertTrue(result.getAttributes().containsKey(tag.toLowerCase()));
    }

    @Test
    public void removeAttributesRemovesAttributeFromSafelist() {
        // Arrange
        String tag = "p";
        Safelist safelist = new Safelist();
        safelist.addAttributes(tag.toLowerCase(), "class", "text/plain");
        safelist.removeAttributes(tag);
        // Act
        Safelist result = instance;
        // Assert
        assertTrue(result.getAttributes().isEmpty());
    }

    @Test
    public void addEnforcedAttributeAddsEnforcedAttributeToSafelist() {
        // Arrange
        String tag = "p";
        Safelist safelist = new Safelist();
        safelist.addAttributes(tag.toLowerCase(), "data-validation", "success");
        Safelist result = instance;
        // Act
        Safelist newSafelist = result;
        // Assert
        assertTrue(newSafelist.getEnforcedAttributes().containsKey(tag.toLowerCase()));
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

    @Test
    public void getEnforcedAttributesReturnsEmptyMap() {
        // Arrange
        Safelist safelist = new Safelist();
        // Act
        Safelist result = instance.getEnforcedAttributes("a");
        // Assert
        assertTrue(result.isEmpty());
    }

}