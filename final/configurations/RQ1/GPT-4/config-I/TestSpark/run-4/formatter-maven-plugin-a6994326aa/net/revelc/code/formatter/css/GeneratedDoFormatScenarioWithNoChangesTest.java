package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

public class GeneratedDoFormatScenarioWithNoChangesTest {

    @Test
    public void doFormatScenarioWithNoChangesTest() throws Exception {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
        String initialCode = "body {\n    color: #ffffff;\n}";
        assertNull(cssFormatter.doFormat(initialCode, LineEnding.CRLF));
    }

}