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
public class GeneratedTest {

    @BeforeClass
    public static void setup() {
        // Initialize Jsoup's HTML parser to avoid initialization issues
        Jsoup.init();
    }

    @Test
    public void none() {
        Document document = Jsoup.parse("<html><body>none</body></html>");
        Safelist safelist = org.jsoup.safety.Safelist.none();

        assertEquals(document, safelist.apply(document));
    }

    @Test
    public void simpleText() {
        Document document = Jsoup.parse("<html><body>simple text</body></html>");
        Safelist safelist = org.jsoup.safety.Safelist.simpleText();

        assertEquals(document, safelist.apply(document));
    }

    @Test
    public void basic() {
        Document document = Jsoup.parse("<html><body>basic</body></html>");
        Safelist safelist = org.jsoup.safety.Safelist.basic();

        assertEquals(document, safelist.apply(document));
    }

    @Test
    public void basicWithImages() {
        Document document = Jsoup.parse("<html><body>basic with images</body></html>");
        Safelist safelist = org.jsoup.safety.Safelist.basicWithImages();

        assertEquals(document, safelist.apply(document));
    }

    @Test
    public void relaxed() {
        Document document = Jsoup.parse("<html><body>relaxed</body></html>");
        Safelist safelist = org.jsoup.safety.Safelist.relaxed();

        assertEquals(document, safelist.apply(document));
    }

    @Test
    public void isSafeTag() {
        Document document = Jsoup.parse("<html><body>is safe tag</body></html>");
        Safelist safelist = org.jsoup.safety.Safelist();

        when(safelist.isSafeTag("tag")).thenReturn(true);

        assertTrue(safelist.isSafeTag("tag"));
    }

    @Test
    public void isSafeAttribute() {
        Document document = Jsoup.parse("<html><body>is safe attribute</body></html>");
        Safelist safelist = org.jsoup.safety.Safelist();

        when(safelist.isSafeTag("tag")).thenReturn(true);

        assertTrue(safelist.isSafeAttribute("tag", null, new org.jsoup.nodes.Attribute()));
    }

    @Test
    public void getEnforcedAttributes() {
        Document document = Jsoup.parse("<html><body>get enforced attributes</body></html>");
        Safelist safelist = org.jsoup.safety.Safelist();

        when(safelist.isSafeTag("tag")).thenReturn(true);

        List<String> enforcedAttributes = safelist.getEnforcedAttributes("tag");

        assertEquals(1, enforcedAttributes.size());
    }

    public static class MockAttribute extends org.jsoup.nodes.Attribute {
        private final boolean safe;

        public MockAttribute(boolean safe) {
            this.safe = safe;
        }

        @Override
        public boolean isSafe() {
            return safe;
        }
    }

    @Test
    public void isSafeTagReturnsTrue() {
        Document document = Jsoup.parse("<html><body>is safe tag</body></html>");
        Safelist safelist = org.jsoup.safety.Safelist();

        when(safelist.isSafeTag("tag")).thenReturn(true);

        assertTrue(safelist.isSafeTag("tag"));
    }

}