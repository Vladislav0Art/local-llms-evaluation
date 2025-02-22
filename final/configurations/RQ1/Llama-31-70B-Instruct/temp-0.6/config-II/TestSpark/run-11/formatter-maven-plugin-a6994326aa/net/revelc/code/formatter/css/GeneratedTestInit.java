package net.revelc.code.formatter.css;

public class GeneratedTestInit {

    private CssFormatter cssFormatter;

    @Test
    public void testInit() {
        // Given
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "True");
        options.put("useSourceStringValues", "False");
        ConfigurationSource cfg = null; // TODO: Initialize the cfg object

        // When
        cssFormatter.init(options, cfg);

        // Then
        assertNotNull(cssFormatter.formatter);
        assertEquals(4, cssFormatter.formatter.getPropertiesInSeparateLines());
        assertTrue(cssFormatter.formatter.isRgbAsHex());
        assertFalse(cssFormatter.formatter.isUseSourceStringValues());
    }

}