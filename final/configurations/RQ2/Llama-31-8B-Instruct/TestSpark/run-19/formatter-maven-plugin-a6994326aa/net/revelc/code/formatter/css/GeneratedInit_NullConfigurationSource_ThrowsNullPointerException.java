package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInit_NullConfigurationSource_ThrowsNullPointerException {

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void init_NullConfigurationSource_ThrowsNullPointerException() {
        Map<String, String> options = Map.of();
        assertThrows(NullPointerException.class, () -> formatter.init(options, null));
    }

}