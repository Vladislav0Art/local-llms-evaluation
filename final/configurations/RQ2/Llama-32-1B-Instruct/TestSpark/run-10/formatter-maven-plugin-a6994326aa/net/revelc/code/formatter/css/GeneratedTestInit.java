package net.revelc.code.formatter.css;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;

public class GeneratedTestInit {

    public static void doFormat(String code, LineEnding ending) {
        CSSFormat format = new CSSFormat();
        CssStyleSheetImpl stylesheet = format.parseInputSource(new StringReader(code));
        System.out.println(stylesheet.toString());
    }

    @Test
    public void testInit() {
        AbstractCacheableFormatter formatter = new CssFormatter();
    }

}