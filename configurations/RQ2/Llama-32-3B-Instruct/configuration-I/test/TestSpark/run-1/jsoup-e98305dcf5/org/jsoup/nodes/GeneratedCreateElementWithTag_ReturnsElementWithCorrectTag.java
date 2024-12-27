package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(JUnit4.class)
public class GeneratedCreateElementWithTag_ReturnsElementWithCorrectTag {

    @Mock
    private Tag tag;

    public ElementTest() {
        MockitoAnnotations.initMocks(this);
    }

    // Tag related tests

    @Test
    public void createElementWithTag_ReturnsElementWithCorrectTag() {
        Element element = new Element(tag, null, null);
        assertEquals(tag, element.tag());
    }

}