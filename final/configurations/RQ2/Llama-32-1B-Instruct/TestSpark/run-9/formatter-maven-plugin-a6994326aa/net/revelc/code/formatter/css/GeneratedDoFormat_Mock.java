package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedDoFormat_Mock {

    @Test
    public void doFormat_Mock() {
        String code = "body {\n  background-color: #f2f2f2;\n}";
        LineEnding ending = LineEnding.LF_ALL;
        when(mockInputSource.getCharacterData()).thenReturn(code);
        cssGenerator = getCssGenerator(ending);
        cssGenerator.format();
    }

}