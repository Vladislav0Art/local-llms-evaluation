package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

@RunWith(PowerMockRunner.class)
public class GeneratedTestDoFormatWhenCodeIsSameAsFormattedCode {

    CssFormatter .class
})

public class CssFormatterTest {

    @Test
    public void testDoFormatWhenCodeIsSameAsFormattedCode() throws IOException {
        // Arrange
        CssFormatter formatter = new CssFormatter();
        String code = "body {\n    color: red;\n}\n";
        LineEnding ending = LineEnding.LF;

        // Act
        String actual = formatter.doFormat(code, ending);

        // Assert
        assertNull(actual);
    }

}