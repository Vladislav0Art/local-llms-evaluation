package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testGenerateHtml() {
        // Create public method to generate HTML
        public String generateHtml (String html){
            return "<html>" + html + "</html>";
        }

        @Test
        public void testGenerateHtmlWithAnchor () {
            assertTrue(generateHtml("<a href=\"#anchor\">Anchor</a>").contains("Anchor"));
        }

        // Generate HTML using the public method with multiple elements
        String generatedHtml2 = generateHtml("<a href=\"#anchor\">Anchor</a> <p>This is a paragraph.</p>");
        assertEquals("<html><a href=\"#anchor\">Anchor</a> <p>This is a paragraph.</p></html>", generatedHtml2);
    }

    @Test
    public void testGenerateAttribute() {
        // Create public method to generate attribute
        public String generateAttribute (String key, String value){
            return "key=\"" + value + "\"";
        }

        @Test
        public void testGenerateAttributeWithValue () {
            assertTrue(generateAttribute("href", "#anchor").equals("href=\"#anchor\"");
        }
    }

    @Test
    public void testElement() {
        // Create public method to generate element
        public String generateElement (String tag, String html){
            return "<" + tag + ">" + html + "</" + tag + ">";
        }

        @Test
        public void testGenerateElementWithAnchor () {
            assertTrue(generateElement("a", "#anchor").contains("#anchor"));
        }
    }

    @Test
    public void testConfiguration() {
        // Create public method to generate configuration
        public String generateConfiguration () {
            return "<configuration></configuration>";
        }

        @Test
        public void testGenerateConfigurationWithElements () {
            assertTrue(generateConfiguration().contains("")));
        }
    }

}