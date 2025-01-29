package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedTestRelaxed_SafeTagsAreNotElementsWithStyles {

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
    public void testRelaxed_SafeTagsAreNotElementsWithStyles() {
        assertFalse(relaxed.isSafeTag("<p style='background-color: red;'>"));
        assertTrue(relaxed.isSafeTag("<div class='test-class'>"));
        Set<String> enforcedAttributes = relaxed.getEnforcedAttributes("p");
        assertEquals("[class='test-class']", getAttributeString(enforcedAttributes));
    }

}