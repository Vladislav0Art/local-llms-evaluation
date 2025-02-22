package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestInit {

    @Test
    public void testInit() {
        // Arrange
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        CssFormatter formatter = new CssFormatter();
        LineEnding lineEnding = LineEnding.UNIX;

        // Act
        formatter.init(options, lineEnding);

        // Assert
        assertNotNull(formatter.getFormatter());
        assertEquals(formatter.getFormatter().getIndent(), 4);
        assertEquals(formatter.getFormatter().isRgbAsHex(), true);
        assertEquals(formatter.getFormatter().isUseSourceStringValues(), false);
    }

}