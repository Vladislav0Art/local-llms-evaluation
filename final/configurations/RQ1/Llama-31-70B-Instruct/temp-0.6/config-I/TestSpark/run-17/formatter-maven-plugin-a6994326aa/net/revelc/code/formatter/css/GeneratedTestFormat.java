package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestFormat {

    @Test
    public void testFormat() {
        final String code = "body { color: #000; }";
        final LineEnding ending = LineEnding.LF;

        final CssFormatter formatter = new CssFormatter();
        final String formattedCode = formatter.doFormat(code, ending);

        assertEquals("body {\n    color: #000;\n}\n", formattedCode);
    }
}

}