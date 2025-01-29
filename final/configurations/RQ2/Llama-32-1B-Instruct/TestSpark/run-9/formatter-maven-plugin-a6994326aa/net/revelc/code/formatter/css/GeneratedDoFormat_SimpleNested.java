package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedDoFormat_SimpleNested {

    @Test
    public void doFormat_SimpleNested() {
        String code = "body {\n  background-color: #f2f2f2;\n  color: #000;\n}\nbody {\n  width: 100%;\n  height: 100%;\n}";
        LineEnding ending = LineEnding.LF_ALL;
        when(mockInputSource.getCharacterData()).thenReturn(code);
        cssGenerator = getCssGenerator(ending);
        cssGenerator.format();
    }

    public ConfigurationSource getConfigurationSource() {
        return new ConfigurationSource("config.json");
    }

    public CssGenerator getCssGenerator(LineEnding ending) {
        return new CssGenerator(ending);
    }

}