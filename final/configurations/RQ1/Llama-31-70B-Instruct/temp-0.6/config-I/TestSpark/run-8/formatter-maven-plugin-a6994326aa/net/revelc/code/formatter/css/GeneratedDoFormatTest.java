package net.revelc.code.formatter.css;

import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormatTest {

    @Mock
    private CSSStyleSheetImpl sheet;
    @Mock
    private ConfigurationSource cfg;
    @InjectMocks
    private CssFormatter cssFormatter;

    @BeforeEach
    public void setUp() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void doFormatTest() {
        String code = "test";
        LineEnding ending = LineEnding.LF;
        String formattedCode = cssFormatter.doFormat(code, ending);
    }

}