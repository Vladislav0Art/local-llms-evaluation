package net.revelc.code.formatter.css;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInit ThrowsExceptionWhenOptionsAreEmpty {

    @BeforeClass
    public static void setup() {
        // Initialize the formatter with a mock configuration source
        when(CssFormatter.getInstance().getConfigurationSource()).thenReturn(new ConfigurationSource());
    }

    @Test
    public void init

    ThrowsExceptionWhenOptionsAreEmpty() throws IOException {
        Map<String, String> options = Mockito.mock(Map.class);
        when(options.isEmpty()).thenReturn(true);

        // Act and assert
        try {
            CssFormatter.getInstance().init(options, new ConfigurationSource());
            assertTrue(false); // Should not reach here
        } catch (IOException e) {
            // Expected exception
        }
    }

}