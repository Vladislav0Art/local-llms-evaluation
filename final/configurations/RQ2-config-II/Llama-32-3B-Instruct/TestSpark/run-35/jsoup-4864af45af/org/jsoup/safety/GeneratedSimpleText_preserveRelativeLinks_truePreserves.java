package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedSimpleText_preserveRelativeLinks_truePreserves {

    @Test
    public void simpleText_preserveRelativeLinks_truePreserves() {
        Set<String> expectedProtocols = new HashSet<>(Arrays.asList("http://example.com"));
        Safelist list = Safelist.simpleText();
        Set<String> actualProtocols = new HashSet<>();
        list.preserveRelativeLinks(true).addProtocols("a", "href", expectedProtocols.toArray(new String[0]));
        assertEquals(expectedProtocols, actualProtocols);
    }

}