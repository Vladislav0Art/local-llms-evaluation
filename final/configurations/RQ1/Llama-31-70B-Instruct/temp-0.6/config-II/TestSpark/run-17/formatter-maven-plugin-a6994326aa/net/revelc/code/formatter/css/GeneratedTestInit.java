package net.revelc.code.formatter.css;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestInit {

    private CssFormatter cssFormatter;

    @Before
    public void setup() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void testInit() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        cssFormatter.init(options, cfg);

        assertEquals(4, cssFormatter.formatter.getIndent());
        assertTrue(cssFormatter.formatter.isRgbAsHex());
        assertFalse(cssFormatter.formatter.isUseSourceStringValues());
    }

}