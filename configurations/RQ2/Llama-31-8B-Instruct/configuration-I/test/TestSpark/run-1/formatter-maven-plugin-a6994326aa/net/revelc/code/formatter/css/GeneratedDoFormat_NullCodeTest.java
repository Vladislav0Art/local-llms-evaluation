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
public class GeneratedDoFormat_NullCodeTest {

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void doFormat_NullCodeTest() {
        LineEnding ending = mock(LineEnding.class);
        try {
            formatter.doFormat(null, ending);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
            // expected
        }
    }

}