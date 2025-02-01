package net.revelc.code.formatter.css;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        String formattedCode = formatter.doFormat("a{color:red;}", LineEnding.AUTO);
        assertNotNull(formattedCode);
    }

}