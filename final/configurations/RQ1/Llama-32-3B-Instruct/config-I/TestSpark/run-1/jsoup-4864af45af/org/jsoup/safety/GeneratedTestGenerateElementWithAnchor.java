package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGenerateElementWithAnchor {

    @Test
    public void testGenerateElementWithAnchor() {
        assertTrue(generateElement("a", "#anchor").contains("#anchor"));
    }
}

}