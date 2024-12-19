package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCssFormatter_doFormat_Simple_WithOptions {

    @Test
    public void cssFormatter_doFormat_Simple_WithOptions() {
        // Arrange
        String code = "{";
        LineEnding ending = Mockito.mock(LineEnding.class);
        ConfiguredConfiguration cfgMock = Mockito.mock(ConfiguredConfiguration.class);

        // Act
        String result = CssFormatter.doFormat(code, ending, "{", "}");

        // Assert
        Mockito.verify(ending).append(Mockito.anyString());
        Mockito.verify(cfgMock).append(Mockito.anyString());
    }

}