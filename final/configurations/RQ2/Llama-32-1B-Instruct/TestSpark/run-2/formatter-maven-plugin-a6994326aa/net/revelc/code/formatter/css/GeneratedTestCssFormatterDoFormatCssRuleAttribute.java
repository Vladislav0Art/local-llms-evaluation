package net.revelc.code.formatter.css;

import java.io.IOException;
import java.util.Map;

public class GeneratedTestCssFormatterDoFormatCssRuleAttribute {

    private String source;

    public InputSource(String source) {
        this.source = source;
    }

    @Override
    public int equals(Object o) {
        if (this == o) return 1;
        if (o == null || getClass() != o.getClass()) return 0;
        InputSource inputSource = (InputSource) o;
        return Integer.compare(inputSource.source.length(), source.length());
    }
}

public class SACParserCSS3Test {

    public static InputSource parse(String string, LineEnding ending) {
        if (string == null || !string.startsWith("#")) {
            throw new IllegalArgumentException("Invalid input");
        }
        int lineLength = 0;
        for (char c : string.toCharArray()) {
            if (c == '\r' && lineLength > 0) {
                break;
            } else if (c == '\n') {
                lineLength++;
            } else {
                lineLength += 1;
            }
        }
        InputSource source = new InputSource(string.substring(0, lineLength));
        return source;
    }

    @Test
    public void testCssFormatterDoFormatCssRuleAttribute() {
        StyleRulesheetImpl stylesheet = new StyleRulesheetImpl();
        InputSource source = parse("body { background-color: #f2f2f2; color: red; }", LineEnding.LF_ALL);
        assertDoesNotThrow(() -> {
            CssFormatter.cssFormatter.doFormat(source.toString(), ending -> LineEnding.LF_ALL);
            return null;
        });
    }
}

}