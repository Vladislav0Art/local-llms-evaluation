package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasic_addProtocols_withMultipleProtocols {

    @Test
    public void basic_addProtocols_withMultipleProtocols() {
        Set<String> expectedProtocols = new HashSet<>(Arrays.asList("http://example.com", "https://example.net"));
        Safelist list = Safelist.basic();
        List<String> tags = Arrays.asList("a");
        Set<String> actualProtocols = new HashSet<>();
        list.addProtocols(tags.toArray(new String[0]), "a", expectedProtocols.toArray(new String[0]));
        assertEquals(expectedProtocols, actualProtocols);
    }

}