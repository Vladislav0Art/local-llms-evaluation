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

public class GeneratedDoFormat_InvalidCode_ThrowsIOException {

    @Test
    public void doFormat_InvalidCode_ThrowsIOException() throws Exception {
        final String code = "invalid";

        final CssFormatter formatter = new CssFormatter();

        final IOException exception = expectThrowingException(formatter.doFormat, code);
        assertNotNull(exception);
    }
}

class AbstractCacheableFormatter {

}

class LineEnding {

    public static final String LF = "\n";
}

class ConfigurationSource {
    public Map<String, String> getOptions() {
        return null;
    }
}

interface Formatter {
}

class CssFormatter extends AbstractCacheableFormatter implements Formatter {

    public void init(Map<String, String> options, ConfigurationSource mockCfg) {
    }

    public String doFormat(String code, LineEnding ending) throws IOException {
        return "";
    }

}