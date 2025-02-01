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
public class GeneratedDoFormatNoChangesTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void doFormatNoChangesTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        cssFormatter.init(options, null);

        String code = "body {\n    background-color : #efefef;\n    margin : 0\n}";

        assertNull(cssFormatter.doFormat(code, null));
    }

}