package net.revelc.code.formatter.css;

public class GeneratedInit_EmptyOptions_ThrowsIOException {

    @Test
    public void init_EmptyOptions_ThrowsIOException() {
        CssFormatter formatter = new CssFormatter();
        assertThrows(IOException.class, () -> formatter.init(Map.of(), null));
    }

}