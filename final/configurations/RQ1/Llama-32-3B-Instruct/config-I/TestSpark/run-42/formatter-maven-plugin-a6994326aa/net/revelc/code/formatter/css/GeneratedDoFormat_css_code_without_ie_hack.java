package net.revelc.code.formatter.css;

public class GeneratedDoFormat_css_code_without_ie_hack {

    private static final String INDENT_OPTIONS = "indent=4";
    private static final String RgbAsHexOptions = Boolean.TRUE.toString();
    private static final String UseSourceStringValuesOptions = Boolean.FALSE.toString();

    @Test
    public void doFormat_css_code_without_ie_hack() throws IOException {
        String code = "a,b,c";
        LineEnding ending = LineEnding.LF;
        String formattedCode = mock(String.class);
        when(cssFormat.getCssText(mock(CSSStyleSheetImpl.class))).thenReturn(formattedCode);
        CssFormatter formatter = new CssFormatter();
        assertEquals(formattedCode, formatter.doFormat(code, ending));
    }

}