package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatInvalidCss {

    @Test
    public void testDoFormatInvalidCss() throws IOException {
        String cssCode = ".class {\n" +
                "  property: value" +
                "}";
        InputSource input = new InputSource(new ByteArrayInputStream(cssCode.getBytes()));
        CssFormatter formatter = new CssFormatter();
        assertThrows(IOException.class, () -> formatter.doFormat(input));
    }
}

public class ConfigurationSource {
    // configuration source implementation
}

public class CssFormatter {

    public boolean isInitialized() {
        return true;
    }

    public void init(Map<String, String> options, ConfigurationSource cfg) {
    }

    public String doFormat(InputSource input) throws IOException {
        return "";
    }

}