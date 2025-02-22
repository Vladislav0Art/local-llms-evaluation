package net.revelc.code.formatter.css;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, null);
        assertEquals(4, formatter.formatter.getPropertiesInSeparateLines());
        assertTrue(formatter.formatter.isRgbAsHex());
        assertFalse(formatter.formatter.isUseSourceStringValues());
    }

}