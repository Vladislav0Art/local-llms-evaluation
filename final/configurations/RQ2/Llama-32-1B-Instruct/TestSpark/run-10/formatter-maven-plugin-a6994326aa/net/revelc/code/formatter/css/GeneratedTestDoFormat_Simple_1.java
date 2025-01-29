package net.revelc.code.formatter.css;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;

public class GeneratedTestDoFormat_Simple_1 {

    public static void doFormat(String code, LineEnding ending) {
        CSSFormat format = new CSSFormat();
        CssStyleSheetImpl stylesheet = format.parseInputSource(new StringReader(code));
        System.out.println(stylesheet.toString());
    }

    @Test
    public void testDoFormat_Simple_1() throws IOException {
        doFormat("body { background-color: #f2f2f2; }\n\nh1 { font-size: 24px; }\n", LineEnding.LF_LINES);
    }

}