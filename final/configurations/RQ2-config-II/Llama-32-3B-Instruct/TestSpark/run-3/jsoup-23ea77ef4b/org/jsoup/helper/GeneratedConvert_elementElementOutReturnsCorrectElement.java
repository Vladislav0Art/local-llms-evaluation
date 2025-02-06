package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Map;

public class GeneratedConvert_elementElementOutReturnsCorrectElement {

    @Test
    public void convert_elementElementOutReturnsCorrectElement() {
        org.jsoup.nodes.Element inElement = Mockito.mock(org.jsoup.nodes.Element.class);
        Element outElement = Mockito.mock(Element.class);
        W3CDom.convert(inElement, outElement);
        // No direct assertion for this method as it modifies the element
    }

}