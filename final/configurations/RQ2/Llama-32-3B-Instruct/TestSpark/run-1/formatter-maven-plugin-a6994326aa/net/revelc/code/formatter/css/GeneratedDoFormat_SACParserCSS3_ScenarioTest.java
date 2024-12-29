package net.revelc.code.formatter.css;

public class GeneratedDoFormat_SACParserCSS3_ScenarioTest {

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
    public void doFormat_SACParserCSS3_ScenarioTest() throws IOException {
        CSSOMParser parser = Mockito.mock(CSSOMParser.class);
        when(parser.getSyntax()).thenReturn(new SACParserCSS3());
        String code = "";
        LineEnding lineEnding = new LineEnding(LineEnding.Type.LF);
        formatter.doFormat(code, lineEnding, parser);
    }

}