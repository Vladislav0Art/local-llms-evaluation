package org.jsoup.nodes;

public class GeneratedCreateElementWithNullTagNameTest_Fails {

    @Test
    public void createElementWithNullTagNameTest_Fails() {
        assertThrows(NullPointerException.class, () -> Document.createElement(null));
    }

}