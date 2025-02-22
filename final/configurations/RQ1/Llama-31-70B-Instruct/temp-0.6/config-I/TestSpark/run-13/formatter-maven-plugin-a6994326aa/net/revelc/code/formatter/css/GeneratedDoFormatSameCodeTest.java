package net.revelc.code.formatter.css;

public class GeneratedDoFormatSameCodeTest {

    private CssFormatter cssFormatter;

    @Before
    public void setup() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void doFormatSameCodeTest() throws IOException {
        String code = "h1 {\n    color: red;\n}";
        String ending = "\n";
        cssFormatter.init(new HashMap<>(), null);

        String result = cssFormatter.doFormat(code, ending);

        assertNull(result);
    }

}