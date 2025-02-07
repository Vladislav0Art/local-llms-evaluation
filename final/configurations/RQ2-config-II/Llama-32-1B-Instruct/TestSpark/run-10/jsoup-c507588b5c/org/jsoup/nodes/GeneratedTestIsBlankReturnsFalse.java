package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.regex.Pattern;

public class GeneratedTestIsBlankReturnsFalse {

    @Test
    public void testIsBlankReturnsFalse() {
        TextNode node = new TextNode("   Hello   ");
        assertTrue(node isBlank());
    }

}