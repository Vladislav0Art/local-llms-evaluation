package net.revelc.code.formatter.css;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

public class GeneratedDoFormat_ExistingStylesheetReturnsCorrectResult {

    @BeforeClass
    public static void setup() {
        // Initialize the formatter with a mock configuration source
        Mockito.when(CssFormatter.getInstance().getConfigurationSource()).thenReturn(new ConfigurationSource());
    }

    @Test
    public void doFormat_ExistingStylesheetReturnsCorrectResult() throws IOException {
        String existingStylesheet = "/* existing stylesheet */";
        String expectedOutput = "/* output */";

        // Set up the parser to return the existing stylesheet
        CssOMParser cssOMParser = new CssOMParser(existingStylesheet);

        // Format the stylesheet
        String formattedStylesheet = CssFormatter.getInstance().doFormat(existingStylesheet, LineEnding.LF);

        assertEquals(expectedOutput, formattedStylesheet);
    }

}