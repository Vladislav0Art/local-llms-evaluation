package net.revelc.code.formatter.css;

public class GeneratedDoFormatTest {

    private CssFormatter cssFormatter;

    @Before
    public void setup() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void doFormatTest() throws IOException {
        String code = "h1 { color: red; }";
        String expected = "h1 {\n    color: red;\n}";
        String ending = "\n";
        cssFormatter.init(new HashMap<>(), null);

        String result = cssFormatter.doFormat(code, ending);

        assertEquals(expected, result);
    }

}