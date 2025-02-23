package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import com.steadystate.css.format.CSSFormat;

public class GeneratedInitTest {

    private static final String CODE = "code";
    private static final String ENDING = "ending";
    private static final String FORMATTED_CODE = "formatted code";
    private static final String CODE_OUTPUT = "code output";
    private static final String CODE_INPUT = "code input";
    private static final String EXPECTED = "expected";
    private static final String ACTUAL = "actual";

    private CssFormatter cssFormatter;

    @Test
    public void initTest() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", Boolean.TRUE.toString());
        options.put("useSourceStringValues", Boolean.FALSE.toString());

        cssFormatter = new CssFormatter();
        cssFormatter.init(options, null);

        assertEquals(new CSSFormat().setPropertiesInSeparateLines(4).setRgbAsHex(true)
                .setUseSourceStringValues(false).getClass(), cssFormatter.formatter.getClass());
    }

}