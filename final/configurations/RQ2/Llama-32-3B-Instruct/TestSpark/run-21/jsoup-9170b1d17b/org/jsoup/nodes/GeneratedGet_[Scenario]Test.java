package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(org.junit4.JUnit4ClassRunner.class)
public class GeneratedGet_[Scenario]

Test {

    @Mock
    private Document document;

    @Test
    public void get_[ Scenario]Test() {
        when(document.getAll()).thenReturn(new Attribute());
        String result = new Attributes().get("key");
        assertEquals("value", result);
    }

}