package net.revelc.code.formatter.css;

public class GeneratedDoFormatTest {

    private CssFormatter cssFormatter;

    @Before
    public void setUp() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void doFormatTest() throws IOException {
        String code = "body { color: #fff; }";
        LineEnding lineEnding = LineEnding.LF;
        String expected = "body {\n\tcolor: #fff;\n}\n";

        String output = cssFormatter.doFormat(code, lineEnding);
        assertEquals(expected, output);
    }

}