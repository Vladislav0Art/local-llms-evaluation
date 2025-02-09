package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedOutputHtmlTest {

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> result = W3CDom.OutputHtml();

        assertNotNull(result);
    }

}