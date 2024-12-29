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
public class GeneratedTestCssFormatterDoFormat_EmptyString {

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
    public void testCssFormatterDoFormat_EmptyString() {
        InputSource inputSource = new StringReader("");
        Map<String, String> options = Map.of("format", "css");

        when(inputSource.getImplementation()).thenReturn(cssFormatImpl);

        when(cssFormatImpl.getOptions()).thenReturn(options);
        when(cssFormatImpl.doFormat(any(String.class), any(LineEnding.class))).thenReturn("");

        String result = cssFormatter.doFormat("", LineEnding.INSERT);
        assertEquals("", result);
    }

}