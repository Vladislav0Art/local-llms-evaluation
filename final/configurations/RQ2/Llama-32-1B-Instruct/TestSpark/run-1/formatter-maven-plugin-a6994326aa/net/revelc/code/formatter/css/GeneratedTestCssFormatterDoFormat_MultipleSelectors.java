package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.StringReader;
import java.util.Map;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCssFormatterDoFormat_MultipleSelectors {

    @Mock
    private InputSource inputSource;

    @InjectMocks
    private CssFormatter cssFormatter;

    public void testCssFormatterInitialization() {
        when(inputSource.getImplementation()).thenReturn(cssFormatImpl);
        Map<String, String> options = Map.of("format", "css");
        when(cssFormatImpl.getOptions()).thenReturn(options);

        String result = cssFormatter.init(options, inputSource);
        assertEquals("linear-gradient(90deg, linear-gradient(to right, red, blue), red)", result);
    }

    @Test
    public void testCssFormatterDoFormat_MultipleSelectors() {
        InputSource inputSource = new StringReader("/* This is a CSS code */\n/* Another CSS code */");
        Map<String, String> options = Map.of("format", "css");

        when(inputSource.getImplementation()).thenReturn(cssFormatImpl);

        when(cssFormatImpl.getOptions()).thenReturn(options);
        when(cssFormatImpl.doFormat(any(String.class), any(LineEnding.class))).thenReturn("result");

        String result = cssFormatter.doFormat("/* This is a CSS code */\n/* Another CSS code */", LineEnding.INSERT);
        assertEquals("linear-gradient(90deg, linear-gradient(to right, red, blue), red)", result);
    }

}