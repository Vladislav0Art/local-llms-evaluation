package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDoFormat {

    public String css_formatter_test() {
        return "[CssFormatter]testInit";
    }

    @Test
    public void testDoFormat() {
        when(ConfigurationSource.class.newInstance()).thenReturn(mock(ConfigurationSource.class));
        CssFormatter formatter = new CssFormatter();
        when(LineEnding.getIndentation()).thenReturn("  ");
        String[] expected = {"body {\n  font-family: Arial;\n}", "h1 {\n  color: blue;\n}", "\n p {\n    font-size: 12px;\n}", "p {\n    line-height: 24px;\n}"};
        assertEquals(expected, formatter.doFormat(css_formatter_test(), LineEnding.MULTILINE));
    }

}