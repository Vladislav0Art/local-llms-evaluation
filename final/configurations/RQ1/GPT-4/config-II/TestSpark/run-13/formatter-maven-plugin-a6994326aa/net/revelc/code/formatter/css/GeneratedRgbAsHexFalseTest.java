package net.revelc.code.formatter.css;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRgbAsHexFalseTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void rgbAsHexFalseTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("rgbAsHex", "false");
        cssFormatter.init(options, null);

        String code = "body {background-color: rgb(239, 239, 239);margin: 0;}";
        String expectedResult = "body {\n    background-color : rgb(239, 239, 239);\n    margin : 0\n}";

        assertEquals(expectedResult, cssFormatter.doFormat(code, null));
    }

}