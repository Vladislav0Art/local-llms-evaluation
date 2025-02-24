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

public class GeneratedTestGetElementById {

    @Test
    public void testGetElementById() {
        Element element = mock(Element.class);
        when(element.getElementById("id")).thenReturn(null);
        assertNull(element.getElementById("id"));
    }

}