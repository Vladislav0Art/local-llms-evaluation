package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatWithInit {

    private static final String CODE = "body { background-color: #f2f2f2; }";
    private static final LineEnding LINE_ENDING = LineEnding.LF;
    private static final CSSOMParser parser = Mockito.mock(CSSOMParser.class);

    @Test
    public void testDoFormatWithInit() {
        // Mocking the constructor with a ConfigurationSource argument is not possible here as it's abstract.
        CssFormatter formatter = new CssFormatter();
        String formattedCss = formatter.doFormat(CODE, LINE_ENDING, parser);
        assertEquals("body { background-color: #f2f2f2; }\n", formattedCss);
    }
}

public class LineEnding {
    public static final String LF = "\n";
}

public interface CSSOMParser {
    Syntax getSyntax();
}

public abstract class AbstractCacheableFormatter implements CssFormatter {
    public void doFormat(String css, LineEnding lineEnding, CSSOMParser parser) {
        // implementation
    }

    @Override
    public boolean isInitialized() {
        return true;
    }
}

public interface CssFormatter extends AbstractCacheableFormatter {
}

public class CssFormatterImpl implements CssFormatter {
    private ConfigurationSource cfg;

    public CssFormatterImpl(ConfigurationSource cfg) {
        this.cfg = cfg;
    }

    @Override
    public String doFormat(String css, LineEnding lineEnding, CSSOMParser parser) {
        // implementation
    }

}