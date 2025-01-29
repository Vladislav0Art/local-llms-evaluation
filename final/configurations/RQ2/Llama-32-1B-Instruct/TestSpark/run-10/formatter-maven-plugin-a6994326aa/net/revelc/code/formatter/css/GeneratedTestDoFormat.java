package net.revelc.code.formatter.css;

public class GeneratedTestDoFormat {

    @Test
    public void testDoFormat() throws IOException {
        InputSource inputSource = new StringReader("body { background-color: #f2f2f2; }\n\nh1 { font-size: 24px; }\n");
        LineEnding ending = LineEnding.LF_LINES;
        CssFormatter formatter = new CssFormatter();
        StringWriter writer = new StringWriter();
        formatter.doFormat(inputSource, ending, writer);
        assertEquals("body { background-color: #f2f2f2;}\n\nh1 { font-size: 24px; }\n", writer.toString());
    }

}