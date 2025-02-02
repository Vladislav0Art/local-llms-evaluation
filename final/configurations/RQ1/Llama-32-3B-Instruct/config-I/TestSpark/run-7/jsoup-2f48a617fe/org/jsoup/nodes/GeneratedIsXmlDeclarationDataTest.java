package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationDataTest {

    @Test
    public void isXmlDeclarationDataTest() {
        assertTrue(isXmlDeclarationData("<!-- This is a comment -->"));
        assertFalse(isXmlDeclarationData(""));
        assertFalse(isXmlDeclarationData("!"));
        assertFalse(isXmlDeclarationData("?"));
    }

}