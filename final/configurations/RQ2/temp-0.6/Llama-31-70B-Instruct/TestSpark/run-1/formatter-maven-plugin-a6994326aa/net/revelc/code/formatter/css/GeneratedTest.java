package net.revelc.code.formatter.css;

public class GeneratedTest {

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