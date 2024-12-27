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
public class GeneratedPreserveRelativeLinks_false {

    @BeforeClass
    public static void setup() {
        // Initialize Jsoup's HTML parser to avoid initialization issues
        Jsoup.init();
    }

    @Test
    public void preserveRelativeLinks_false() {
        // Arrange and Act
        Document document = Jsoup.parse("<html><body>preserve relative links false</body></html>");
        Safelist safelist = org.jsoup.safety.Safelist.preserveRelativeLinks(false);

        // Assert
        assertEquals(document, safelist.apply(document));
    }

}