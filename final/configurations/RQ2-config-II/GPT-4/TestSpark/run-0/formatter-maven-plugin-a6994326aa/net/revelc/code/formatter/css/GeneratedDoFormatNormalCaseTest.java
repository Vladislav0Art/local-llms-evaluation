package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormatNormalCaseTest {

    @Test
    public void doFormatNormalCaseTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String formattedCode = cssFormatter.doFormat("body { background: #FFFFFF; }", LineEnding.AUTO);
        assertNotNull(formattedCode);
    }

}