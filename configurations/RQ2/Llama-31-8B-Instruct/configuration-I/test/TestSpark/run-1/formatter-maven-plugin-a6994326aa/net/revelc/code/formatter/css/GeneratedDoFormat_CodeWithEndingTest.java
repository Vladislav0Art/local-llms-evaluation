package net.revelc.code.formatter.css;

import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import net.revelc.code.formatter.css.ConfigurationSource;
import net.revelc.code.formatter.css.LineEnding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormat_CodeWithEndingTest {

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void doFormat_CodeWithEndingTest() {
        LineEnding ending = mock(LineEnding.class);
        when(ending.getEnding()).thenReturn("\n");
        String code = "body { background-color: #f2f2f2; }";
        String result = formatter.doFormat(code, ending);
        assertNotNull(result);
    }

}