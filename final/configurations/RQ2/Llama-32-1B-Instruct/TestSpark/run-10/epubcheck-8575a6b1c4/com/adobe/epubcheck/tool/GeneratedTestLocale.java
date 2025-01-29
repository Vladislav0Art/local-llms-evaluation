package com.adobe.epubcheck.tool;

public class GeneratedTestLocale {

    @Test
    public void testLocale() {
        // Arrange
        String[] args = {"/path/to/file.epub"};
        Locale locale = new Locale("en");

        // Act
        int result = EpubChecker.getLocale(locale);

        // Assert
        assertNotNull(result);
        assertEquals(Locale.EN, result);
    }

}