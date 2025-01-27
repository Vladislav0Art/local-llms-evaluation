package net.revelc.code.formatter.css;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

public class GeneratedDoFormat_NewStylesheetReturnsCorrectResult {

    @BeforeClass
    public static void setup() {
        // Initialize the formatter with a mock configuration source
        Mockito.when(CssFormatter.getInstance().getConfigurationSource()).thenReturn(new ConfigurationSource());
    }

    @Test
    public void doFormat_NewStylesheetReturnsCorrectResult() throws IOException {
        String newStylesheet = "/* new stylesheet */";
        String expectedOutput = "/* output */";

        // Set up the parser to return the new stylesheet
        CssOMParser cssOMParser = new CssOMParser(newStylesheet);

        // Format the stylesheet
        String formattedStylesheet = CssFormatter.getInstance().doFormat(newStylesheet, LineEnding.LF);

        assertEquals(expectedOutput, formattedStylesheet);
    }

}