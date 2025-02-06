package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Attributes attributesMock;

    public Safelist[] safelistArray = new Safelist[]{Safelist.none(), Safelist.simpleText(), Safelist.basic()};

    @Test
    public void isSafeTag_noneTest() {
        assertTrue(Safelist.nono().isSafeTag("img"));
    }

    @Test
    public void isSafeTag_simpleTextTest() {
        when(safelistArray[1].isSafeTag("a")).thenReturn(true);
        assertTrue(Safelist.simpleText().isSafeTag("a"));
    }

    @Test
    public void isSafeTag_basicTest() {
        assertFalse(Safelist.basic().isSafeTag("img"));
    }

    @Test
    public void addTags_noneTest() {
        Safelist safelist = Safelist.nono();
        when(safelist.isSafeTag("img")).thenReturn(true);
        assertEquals(1, safelist.addTags("img").size());
    }

    @Test
    public void removeTags_noneTest() {
        Safelist safelist = Safelist.nono();
        when(safelist.isSafeTag("img")).thenReturn(true);
        assertEquals(0, safelist.removeTags("img").size());
    }

    @Test
    public void addAttributes_noneTest() {
        Safelist safelist = Safelist.nono();
        assertEquals(2, safelist.addAttributes("img", "src", "https://example.com").size());
    }

    @Test
    public void removeAttributes_noneTest() {
        Safelist safelist = Safelist.nono();
        assertEquals(0, safelist.removeAttributes("img", "src").size());
    }

    @Test
    public void isSafeAttribute_simpleTextTest() {
        Element elementMock = new Element();
        when(attributesMock.get("src")).thenReturn("https://example.com");
        when(elementMock.hasAttr("src")).thenReturn(true);
        assertTrue(Safelist.simpleText().isSafeAttribute("a", elementMock, new Attribute("src", "https://example.com")));
    }

    @Test
    public void isSafeAttribute_basicTest() {
        Element elementMock = new Element();
        when(attributesMock.get("src")).thenReturn("https://example.com");
        when(elementMock.hasAttr("src")).thenReturn(false);
        assertFalse(Safelist.basic().isSafeAttribute("a", elementMock, new Attribute("src", "https://example.com")));
    }

    @Test
    public void getEnforcedAttributes_noneTest() {
        assertEquals(0, Safelist.nono().getEnforcedAttributes("img").size());
    }

    @Test
    public void preserveRelativeLinks_falseTest() {
        Safelist safelist = Safelist.nono();
        assertTrue(safelist.preserveRelativeLinks(false));
    }

    @Test
    public void preserveRelativeLinks_trueTest() {
        Safelist safelist = Safelist.nono();
        assertTrue(safelist.preserveRelativeLinks(true));
    }

}