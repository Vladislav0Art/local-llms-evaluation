package net.revelc.code.formatter.css;

public class GeneratedTest {

    @Override
    public Map<String, String> getOptions() {
        return new HashMap<>();
    }
}

public class CssFormatterTest {

    private static final String CSS_SOURCE = "body { background-color: red; }";

    @Mock
    public ConfigurationSource configurationSourceMock;

    @Mock
    public Map<String, String> options;

    public LineEnding getLineEnding() {
        return new LineEnding();
    }

    public class LineEnding {
        public static final String LF = "\n";
    }

    public class CssFormatter {
        public boolean init(Map<String, String> options, ConfigurationSource configurationSource) {
            // implementation
            return true;
        }
    }

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

}