package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedAddProtocols_MultipleProtocolsAddedCorrectlyTest {

    @Test
    public void addProtocols_MultipleProtocolsAddedCorrectlyTest() {
        Safelist safelist = Safelist.relaxed();
        assertEquals(Arrays.asList("http", "https"), safelist.addTags("img").get(0).split("\\s+"));
    }

}