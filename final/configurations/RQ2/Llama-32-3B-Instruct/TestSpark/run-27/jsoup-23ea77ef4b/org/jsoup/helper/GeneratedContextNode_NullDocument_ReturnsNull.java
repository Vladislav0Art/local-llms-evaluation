package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedContextNode_NullDocument_ReturnsNull {

    @Test
    public void contextNode_NullDocument_ReturnsNull() {
        assertNull(W3CDom.contextNode(null));
    }

}