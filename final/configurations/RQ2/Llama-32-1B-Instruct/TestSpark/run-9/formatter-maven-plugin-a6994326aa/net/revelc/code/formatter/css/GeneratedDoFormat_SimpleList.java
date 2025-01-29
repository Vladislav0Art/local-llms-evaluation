package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedDoFormat_SimpleList {

    @Test
    public void doFormat_SimpleList() {
        String code = "body {\n  background-color: #f2f2f2;\n  color: #000;\n}";
        LineEnding ending = LineEnding.LF_ALL;
        when(mockInputSource.getCharacterData()).thenReturn(code);
        cssGenerator = getCssGenerator(ending);
        cssGenerator.format();
    }

}