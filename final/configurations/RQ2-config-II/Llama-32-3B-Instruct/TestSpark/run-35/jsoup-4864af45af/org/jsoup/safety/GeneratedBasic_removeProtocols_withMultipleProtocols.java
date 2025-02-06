package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasic_removeProtocols_withMultipleProtocols {

    @Test
    public void basic_removeProtocols_withMultipleProtocols() {
        Set<String> expectedProtocols = new HashSet<>(Arrays.asList("http://example.com"));
        Safelist list = Safelist.basic();
        List<String> tags = Arrays.asList("a");
        Set<String> actualProtocols = new HashSet<>();
        list.removeProtocols(tags.toArray(new String[0]), "a", new String[]{"https://example.net"});
        assertEquals(expectedProtocols, actualProtocols);
    }

}