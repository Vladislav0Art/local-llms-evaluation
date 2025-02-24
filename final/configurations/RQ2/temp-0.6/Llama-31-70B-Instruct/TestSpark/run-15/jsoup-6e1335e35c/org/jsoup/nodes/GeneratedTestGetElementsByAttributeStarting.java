package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestGetElementsByAttributeStarting {

    @Test
    public void testGetElementsByAttributeStarting() {
        Element element = mock(Element.class);
        when(element.getElementsByAttributeStarting("prefix")).thenReturn(new Elements());
        assertEquals(new Elements(), element.getElementsByAttributeStarting("prefix"));
    }

}