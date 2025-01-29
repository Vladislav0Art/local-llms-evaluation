package net.revelc.code.formatter.css;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import com.steadystate.css.sac.InputStyle;
import com.steadystate.css.sac.Selector;
import com.steadystate.css.sac.StyleRulesheetImpl;

public class GeneratedTestCssFormatterDoFormat WithoutOptions {

    private String source;

    public InputSource(String source) {
        this.source = source;
    }

    public static InputSource parse(String string) {
        return new InputSource(string);
    }
}

import com.steadystate.css.sac.InputStyle;
import com.steadystate.css.sac.Selector;
import com.steadystate.css.sac.StyleRulesheetImpl;

public class SACParserCSS3Test {

    public String cssFormatterDoFormat(InputSource source, LineEnding ending) {
        return cssFormatterDoFormat(source.toString(), ending);
    }

    @Test
    public void testCssFormatterDoFormat

    WithoutOptions() {
        InputSource source = InputSource.parse("body { background-color: #f2f2f2; }");
        assertNotEquals("", CssFormatter::cssFormatterDoFormat);
    }

}