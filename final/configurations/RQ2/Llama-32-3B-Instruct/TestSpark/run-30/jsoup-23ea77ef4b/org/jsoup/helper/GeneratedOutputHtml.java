package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;

public class GeneratedOutputHtml {

    @Test
    public void outputHtml() {
        HashMap<String, String> output = W3CDom.OutputHtml();
        assertTrue(output.containsKey("html"));
    }

}