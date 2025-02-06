package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSafeAttribute_simpleTextTest {

    @Mock
    private Attributes attributesMock;

    public Safelist[] safelistArray = new Safelist[]{Safelist.none(), Safelist.simpleText(), Safelist.basic()};

    @Test
    public void isSafeAttribute_simpleTextTest() {
        Element elementMock = new Element();
        when(attributesMock.get("src")).thenReturn("https://example.com");
        when(elementMock.hasAttr("src")).thenReturn(true);
        assertTrue(Safelist.simpleText().isSafeAttribute("a", elementMock, new Attribute("src", "https://example.com")));
    }

}