package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedTestRelaxed_SafeTagsAreNotElementsWithClassesAndStylesAndImages {

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
    public void testRelaxed_SafeTagsAreNotElementsWithClassesAndStylesAndImages() {
        assertFalse(relaxed.isSafeTag("<div class='test-class'><img src='image.jpg'>"));
        assertTrue(relaxed.isSafeTag("<p>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[class='test-class'], [style='background-color: blue;']", getAttributeString(enforcedAttributes));
    }

}