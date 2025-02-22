package net.revelc.code.formatter.css;

public class GeneratedInitWithDefaultsTest {

    private CssFormatter cssFormatter;

    @Before
    public void setup() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void initWithDefaultsTest() {
        cssFormatter.init(new HashMap<>(), null);

        assertEquals(4, cssFormatter.formatter.getIndent());
        assertEquals(true, cssFormatter.formatter.isRgbAsHex());
        assertEquals(false, cssFormatter.formatter.isUseSourceStringValues());
    }

}