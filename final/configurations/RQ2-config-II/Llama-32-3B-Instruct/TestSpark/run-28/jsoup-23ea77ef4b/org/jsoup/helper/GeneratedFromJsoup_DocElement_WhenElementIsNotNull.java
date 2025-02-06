package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromJsoup_DocElement_WhenElementIsNotNull {

    @Mock
    private Document doc;

    @Test
    public void fromJsoup_DocElement_WhenElementIsNotNull() {
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element();
        W3CDom.fromJsoup(element).equals(doc);
    }

}