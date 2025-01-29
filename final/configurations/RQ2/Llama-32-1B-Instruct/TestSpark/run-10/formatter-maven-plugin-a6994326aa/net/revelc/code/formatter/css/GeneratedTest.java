package net.revelc.code.formatter.css;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.SACParserCSS3;

public class GeneratedTest {

    public static void doFormat(String code, LineEnding ending) {
        CSSFormat format = new CSSFormat();
        SassParser sassParser = new SACParserCSS3(code);
        CssStyleSheetImpl stylesheet = format.parse(sassParser.getStylesheet());
        System.out.println(stylesheet.toString());
    }

}