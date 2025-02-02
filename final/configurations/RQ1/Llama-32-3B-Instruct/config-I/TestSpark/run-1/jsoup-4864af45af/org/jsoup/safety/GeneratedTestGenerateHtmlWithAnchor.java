package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGenerateHtmlWithAnchor {

    @Test
    public void testGenerateHtmlWithAnchor() {
        assertTrue(generateHtml("<a href=\"#anchor\">Anchor</a>").contains("Anchor"));
    }

    // Generate HTML using the public method with multiple elements
    String generatedHtml2 = generateHtml("<a href=\"#anchor\">Anchor</a> <p>This is a paragraph.</p>");

    assertEquals("<html><a href=\"#anchor\">Anchor</a> <p>This is a paragraph.</p></html>",generatedHtml2);
}

}