package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;

import com.steadystate.css.format.CSSFormat;

public class GeneratedIsInitialized_InitMethodCalled_ReturnsTrue {

    @Test
    public void isInitialized_InitMethodCalled_ReturnsTrue() throws Exception {
        final Map<String, String> options = new HashMap<>();
        options.put("option", "value");

        final ConfigurationSource mockCfg = mock(ConfigurationSource.class);
        when(mockCfg.getOptions()).thenReturn(options);

        final CssFormatter formatter = new CssFormatter();
        formatMethodCall(new Object[]{formatter.init, options, mockCfg}, new Object[]{formatter.init, options, mockCfg});

        assertTrue(formatter.isInitialized());
    }

    private static final class Method {
    }
}

class AbstractCacheableFormatter {

}

class LineEnding {
}

}