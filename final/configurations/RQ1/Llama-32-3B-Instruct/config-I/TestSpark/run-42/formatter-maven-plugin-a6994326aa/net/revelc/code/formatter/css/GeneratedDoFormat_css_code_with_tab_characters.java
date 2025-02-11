package net.revelc.code.formatter.css;

public class GeneratedDoFormat_css_code_with_tab_characters {

    private static final String INDENT_OPTIONS = "indent=4";
    private static final String RgbAsHexOptions = Boolean.TRUE.toString();
    private static final String UseSourceStringValuesOptions = Boolean.FALSE.toString();

    @Test
    public void doFormat_css_code_with_tab_characters() throws IOException {
        String code = "\t\t\t\t";
        LineEnding ending = LineEnding.LF;
        String formattedCode = mock(String.class);
        when(cssFormat.getCssText(mock(CSSStyleSheetImpl.class))).thenReturn(formattedCode);
        CssFormatter formatter = new CssFormatter();
        assertEquals(formattedCode, formatter.doFormat(code, ending));
    }

}