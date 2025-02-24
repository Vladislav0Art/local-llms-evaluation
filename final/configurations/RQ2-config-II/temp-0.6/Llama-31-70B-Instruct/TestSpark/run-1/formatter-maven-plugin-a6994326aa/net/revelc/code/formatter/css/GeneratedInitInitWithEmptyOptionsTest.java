package net.revelc.code.formatter.css;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

public class GeneratedInitInitWithEmptyOptionsTest {

    @Test
    public void initInitWithEmptyOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(null, null);
    }

}