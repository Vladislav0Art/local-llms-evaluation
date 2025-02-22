package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import com.steadystate.css.format.CSSFormat;

@RunWith(JUnit4.class)
public class GeneratedTestHexAsRgb {

    private CssFormatter cssFormatter;

    @Before
    public void init() {
        cssFormatter = new CssFormatter();
        final Map<String, String> options = Map.of(
                "indent", "4",
                "rgbAsHex", Boolean.TRUE.toString(),
                "useSourceStringValues", Boolean.FALSE.toString()
        );
        cssFormatter.init(options, null);
    }

    @Test
    public void testHexAsRgb() throws IOException {
        final String code = ".my-class { color: rgb(255, 0, 0);
    }

}