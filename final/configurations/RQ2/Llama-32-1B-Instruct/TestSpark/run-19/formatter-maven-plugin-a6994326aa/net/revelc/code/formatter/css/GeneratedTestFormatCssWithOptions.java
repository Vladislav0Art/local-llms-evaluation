package net.revelc.code.formatter.css;

public class GeneratedTestFormatCssWithOptions {

    @Test
    public void testFormatCssWithOptions() throws IOException {
        String cssCode = "<style>\n" +
                "  body { color: blue; }\n" +
                "</style>";
        LineEnding ending = LineEnding.LF_LINE;
        CSSOMParser parser = new SACParserCSS3();
        parser.parse(new InputSource(cssCode));
        CSSFormat format = parser.getCssFormat();
        assertEquals(ending, format.getLineEndings());
    }

}