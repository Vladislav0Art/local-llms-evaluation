package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedTest {

    private Safelist none;

    @Before
    public void setup() {
        none = new Safelist();
        Document doc1 = Jsoup.parse("<p>This is a test</p>");
        Document doc2 = Jsoup.parse("<img src='image.jpg' alt='An image'>");
        none.addAttribute("class", "test-class");
        none.addAttribute("style", "background-color: blue;");
    }

    @Test
    public void testNone_SafeTagsAreNotRelaxed() {
        assertTrue(none.isSafeTag("p"));
        assertFalse(none.isSafeTag("img"));
    }

    @Test
    public void testSimpleText_SafeAttributesPreserved() {
        Set<String> enforcedAttributes = none.getEnforcedAttributes("p");
        assertEquals("[class='test-class'], [style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testBasic_SafeTagsAreNotRelaxedAndImagesAllowed() {
        assertFalse(basic.isSafeTag("p"));
        assertTrue(basic.isSafeTag("img"));
        assertFalse(basic.isSafeTag("span"));
        Set<String> enforcedAttributes = basic.getEnforcedAttributes("p");
        assertEquals("[class='test-class'], [style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testBasicWithImages_SafeTagsArePreservedAndImagesAllowed() {
        Set<String> enforcedAttributes = basicWithImages.getEnforcedAttributes("p");
        assertEquals("[class='test-class'], [style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotRelaxed() {
        assertFalse(relaxed.isSafeTag("p"));
        assertTrue(relaxed.isSafeTag("img"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[class='test-class'], [style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotImages() {
        assertFalse(relaxed.isSafeTag("img"));
        assertTrue(relaxed.isSafeTag("p"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[class='test-class'], [style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotElements() {
        assertFalse(relaxed.isSafeTag("body"));
        assertTrue(relaxed.isSafeTag("p"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[class='test-class'], [style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotElementsWithClasses() {
        assertFalse(relaxed.isSafeTag("<div class='test-class'>"));
        assertTrue(relaxed.isSafeTag("<p>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotElementsWithStyles() {
        assertFalse(relaxed.isSafeTag("<p style='background-color: red;'>"));
        assertTrue(relaxed.isSafeTag("<div class='test-class'>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[class='test-class']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotImagesWithStyles() {
        assertFalse(relaxed.isSafeTag("<img style='background-color: blue;'>"));
        assertTrue(relaxed.isSafeTag("<div class='test-class'>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[class='test-class']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotImagesWithClassesAndStyles() {
        assertFalse(relaxed.isSafeTag("<img class='test-class' style='background-color: red;'>"));
        assertTrue(relaxed.isSafeTag("<div class='test-class'>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[class='test-class']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotElementsWithClassesAndStyles() {
        assertFalse(relaxed.isSafeTag("<div class='test-class' style='background-color: red;'>"));
        assertTrue(relaxed.isSafeTag("<p>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotElementsWithClassesAndImage() {
        assertFalse(relaxed.isSafeTag("<div class='test-class'><img src='image.jpg'>"));
        assertTrue(relaxed.isSafeTag("<p>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[class='test-class']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotElementsWithClassesAndStylesAndImage() {
        assertFalse(relaxed.isSafeTag("<div class='test-class' style='background-color: red;'><img src='image.jpg'>"));
        assertTrue(relaxed.isSafeTag("<p>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[class='test-class'], [style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotElementsWithClassesAndStylesAndImages() {
        assertFalse(relaxed.isSafeTag("<div class='test-class' style='background-color: red;'><img src='image.jpg'>"));
        assertTrue(relaxed.isSafeTag("<p>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[class='test-class'], [style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotImagesWithClasses() {
        assertFalse(relaxed.isSafeTag("<img class='test-class'>"));
        assertTrue(relaxed.isSafeTag("<div class='test-class'>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotImagesWithClassesAndStyles() {
        assertFalse(relaxed.isSafeTag("<div class='test-class' style='background-color: red;'>"));
        assertTrue(related.isSafeTag("<img src='image.jpg'>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[class='test-class'], [style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotImagesWithClassesAndStylesAndImages() {
        assertFalse(relaxed.isSafeTag("<div class='test-class' style='background-color: red;'><img src='image.jpg'>"));
        assertTrue(relaxed.isSafeTag("<p>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotElementsWithStylesAndImages() {
        assertFalse(relaxed.isSafeTag("<div class='test-class'><img style='background-color: red;'>"));
        assertTrue(relaxed.isSafeTag("<p>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[class='test-class']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotElementsWithStylesAndImages() {
        assertFalse(relaxed.isSafeTag("<div class='test-class'><img src='image.jpg'>"));
        assertTrue(relaxed.isSafeTag("<p>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotElementsWithClassesAndStylesAndImages() {
        assertFalse(relaxed.isSafeTag("<div class='test-class'><img src='image.jpg'>"));
        assertTrue(relaxed.isSafeTag("<p>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[class='test-class'], [style='background-color: red;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotElementsWithClassesAndStylesAndImages() {
        assertFalse(relaxed.isSafeTag("<div class='test-class'><img src='image.jpg'>"));
        assertTrue(relaxed.isSafeTag("<p>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[class='test-class'], [style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

    @Test
    public void testRelaxed_SafeTagsAreNotElementsWithClassesAndStyles() {
        assertFalse(relaxed.isSafeTag("<div class='test-class'><img style='background-color: red;'>"));
        assertTrue(relaxed.isSafeTag("<p>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }
}

}