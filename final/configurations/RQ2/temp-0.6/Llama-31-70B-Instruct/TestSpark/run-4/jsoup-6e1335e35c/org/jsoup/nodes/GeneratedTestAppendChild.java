package org.jsoup.nodes;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestAppendChild {

    Element element;

    @Mock
    ParseSettings parseSettings;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAppendChild() {
        Node childNode = new Node();
        when(parseSettings.getCurrentNode()).thenReturn(childNode);
        element.appendChild(childNode);
        assertEquals(childNode, element.getFirstChild());
    }

}