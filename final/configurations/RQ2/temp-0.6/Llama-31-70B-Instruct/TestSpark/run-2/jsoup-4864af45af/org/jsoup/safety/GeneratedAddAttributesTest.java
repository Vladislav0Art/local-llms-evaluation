package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddAttributesTest {

    @Mock
    private Safelist safelist;

    @Test
    public void addAttributesTest() {
        String tag = "div";
        String[] attributes = new String[]{"id", "class"};
        Safelist actual = safelist.addAttributes(tag, attributes);
        assertNotNull(actual);
    }

}