package net.revelc.code.formatter.css;

public class GeneratedDoFormat_SomethingSelected_ScenarioTest {

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
    public void doFormat_SomethingSelected_ScenarioTest() throws IOException {
        String code = "cssCode";
        String expected = "formattedCssCode";
        when(cfg.getConfig()).thenReturn(java.util.Collections.singletonMap("output", expected));
        assertEquals(expected, formatter.doFormat(code, LineEnding.LF));
    }

}