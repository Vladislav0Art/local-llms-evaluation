package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedGetEnforcedAttributes_ReturnsEnforcedAttributes {

    @Test
    public void getEnforcedAttributes_ReturnsEnforcedAttributes() {
        Safelist safelist = Safelist.none();
        String tagName = "img";
        Attributes attributes = new Attributes(2);
        safelist.addAttributes(tagName, "alt", "src");
        assertEquals(2, ((Attributes) safelist.getEnforcedAttributes(tagName)).size());
    }

}