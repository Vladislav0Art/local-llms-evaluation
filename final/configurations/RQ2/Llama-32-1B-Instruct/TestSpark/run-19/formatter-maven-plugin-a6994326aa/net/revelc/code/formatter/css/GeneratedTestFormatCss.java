package net.revelc.code.formatter.css;

public class GeneratedTestFormatCss {

    @Test
    public void testFormatCss() throws IOException {
        String cssCode = "<style>\n" +
                "  body { background-color: #f2f2f2; }\n" +
                "</style>";
        LineEnding ending = LineEnding.LF_LINE;
        CSSOMParser parser = new SACParserCSS3();
        parser.parse(new InputSource(cssCode));
        CSSFormat format = parser.getCssFormat();
        assertEquals(ending, format.getLineEndings());
    }

}