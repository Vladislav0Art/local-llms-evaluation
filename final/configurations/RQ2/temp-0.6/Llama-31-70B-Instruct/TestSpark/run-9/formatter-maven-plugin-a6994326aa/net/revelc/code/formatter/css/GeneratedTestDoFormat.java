package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;

public class GeneratedTestDoFormat {

    private CssFormatter cssFormatter;

    @Test
    public void testDoFormat() throws IOException {
        String code = "code";
        LineEnding ending = null;

        cssFormatter = new CssFormatter();
        String result = cssFormatter.doFormat(code, ending);

        assertNotNull(result);
    }

}