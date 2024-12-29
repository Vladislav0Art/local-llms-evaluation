package net.revelc.code.formatter.css;

public class GeneratedTestDoFormat {

    private static final String CODE = "body { background-color: #f2f2f2; }";
    private static final LineEnding LINE_ENDING = LineEnding.LF;
    private static final CSSOMParser parser = Mockito.mock(CSSOMParser.class);

    @Test
    public void testDoFormat() {
        CssFormatter formatter = new CssFormatter();
        String formattedCss = formatter.doFormat(CODE, LINE_ENDING, parser);
        assertEquals("body { background-color: #f2f2f2; }\n", formattedCss);
    }

}