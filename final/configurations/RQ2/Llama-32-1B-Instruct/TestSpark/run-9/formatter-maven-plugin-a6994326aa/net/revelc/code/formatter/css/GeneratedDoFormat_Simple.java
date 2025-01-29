package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedDoFormat_Simple {

    @Test
    public void doFormat_Simple() {
        String code = "body { background-color: #f2f2f2; }";
        LineEnding ending = LineEnding.LF_ALL;
        when(mockInputSource.getCharacterData()).thenReturn(code);
        cssGenerator = getCssGenerator(ending);
        cssGenerator.format();
    }

}