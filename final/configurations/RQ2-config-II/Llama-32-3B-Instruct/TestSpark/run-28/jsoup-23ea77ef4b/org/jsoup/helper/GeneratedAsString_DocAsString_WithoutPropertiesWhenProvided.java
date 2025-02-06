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
public class GeneratedAsString_DocAsString_WithoutPropertiesWhenProvided {

    @Mock
    private Document doc;

    @Test
    public void asString_DocAsString_WithoutPropertiesWhenProvided() {
        String result = W3CDom.asString(doc);
        assertNotNull(result);
    }

}