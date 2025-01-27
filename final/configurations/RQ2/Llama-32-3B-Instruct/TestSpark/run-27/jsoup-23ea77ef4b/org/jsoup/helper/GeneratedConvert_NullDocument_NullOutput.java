package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedConvert_NullDocument_NullOutput {

    @Test
    public void convert_NullDocument_NullOutput() {
        Document output = W3CDom.convert(null);
        assertNull(output);
    }

}