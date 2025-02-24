package net.revelc.code.formatter.css;

public class GeneratedInitTest {

    private CssFormatter cssFormatter;

    @Before
    public void setUp() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void initTest() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

}