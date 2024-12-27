package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSimpleText {

    @BeforeClass
    public static void setup() {
        // Initialize Jsoup's HTML parser to avoid initialization issues
        Jsoup.init();
    }

    @Test
    public void simpleText() {
        Document document = Jsoup.parse("<html><body>simple text</body></html>");
        Safelist safelist = org.jsoup.safety.Safelist.simpleText();

        assertEquals(document, safelist.apply(document));
    }

}