package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Map;

public class GeneratedFromJsoup_elementReturnsCorrectElement {

    @Test
    public void fromJsoup_elementReturnsCorrectElement() {
        org.jsoup.nodes.Element element = Mockito.mock(org.jsoup.nodes.Element.class);
        Element expected = Mockito.mock(Element.class);
        Element result = W3CDom.fromJsoup(element);
        assertEquals(expected, result);
    }

}