package net.revelc.code.formatter.css;

public class GeneratedInit_ScenarioTest {

    @Mock
    private ConfigurationSource cfg;

    public void setup() {
        when(cfg.toString()).thenReturn("{}");
        when(cfg.getConfig()).thenReturn(java.util.Collections.singletonMap("output", "expected"));
    }

    @BeforeAll
    public static void initTests() {
        setup();
    }

    @Test
    public void init_ScenarioTest() throws IOException {
        CssFormatter formatter = new CssFormatter(cfg);
        assertNotNull(formatter);
    }

}