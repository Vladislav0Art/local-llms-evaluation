package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Set<String> tags;

    @Test
    public void none_AddTags_ReturnsSame() {
        when(tags).thenReturn(new HashSet<>());
        Safelist result = Safelist.none().addTags("tag");
        assertNotNull(result);
        assertTrue(Safelist.none().isSafeTag("tag"));
    }

    @Test
    public void simpleText_AddTags_ReturnsSame() {
        when(tags).thenReturn(new HashSet<>(java.util.Collections.singletonList("tag")));
        Safelist result = Safelist.simpleText().addTags("tag");
        assertNotNull(result);
        assertTrue(Safelist.simpleText().isSafeTag("tag"));
    }

    @Test
    public void basic_AddTags_ReturnsSame() {
        when(tags).thenReturn(new HashSet<>(java.util.Collections.singletonList("tag")));
        Safelist result = Safelist.basic().addTags("tag");
        assertNotNull(result);
        assertTrue(Safelist.basic().isSafeTag("tag"));
    }

    @Test
    public void relaxed_AddTags_ReturnsSame() {
        when(tags).thenReturn(new HashSet<>(java.util.Collections.singletonList("tag")));
        Safelist result = Safelist.relaxed().addTags("tag");
        assertNotNull(result);
        assertTrue(Safelist.relaxed().isSafeTag("tag"));
    }

    @Test
    public void basicAddAttributes_AddAttributes_ReturnsSame() {
        when(tags).thenReturn(new HashSet<>(java.util.Collections.singletonList("tag")));
        Safelist result = Safelist.basic().addAttributes("tag", "attr1", "value1");
        assertNotNull(result);
        assertTrue(Safelist.basic().isSafeAttribute("tag", new Element(), new Attribute("attr1", "value1")));
    }

    @Test
    public void basicRemoveAttributes_RemoveTags_ReturnsSame() {
        when(tags).thenReturn(new HashSet<>(java.util.Collections.singletonList("tag")));
        Safelist result = Safelist.basic().removeTags("tag");
        assertNotNull(result);
        assertFalse(Safelist.basic().isSafeTag("tag"));
    }

    @Test
    public void basicEnforcedAttributes_AddProtocols_ReturnsSame() {
        when(tags).thenReturn(new HashSet<>(java.util.Collections.singletonList("tag")));
        Safelist result = Safelist.basic().addProtocols("tag", "attr1", "http");
        assertNotNull(result);
        assertTrue(Safelist.basic().isSafeAttribute("tag", new Element(), new Attribute("attr1", "http")));
    }

    @Test
    public void basicEnforcedAttributes_RemoveProtocols_ReturnsSame() {
        when(tags).thenReturn(new HashSet<>(java.util.Collections.singletonList("tag")));
        Safelist result = Safelist.basic().removeProtocols("tag", "attr1");
        assertNotNull(result);
        assertFalse(Safelist.basic().isSafeAttribute("tag", new Element(), new Attribute("attr1", "")));
    }

    @Test
    public void preserveRelativeLinks_Preserve_ReturnsSame() {
        when(tags).thenReturn(new HashSet<>(java.util.Collections.singletonList("tag")));
        Safelist result = Safelist.relaxed().preserveRelativeLinks(true);
        assertNotNull(result);
        assertTrue(Safelist.relaxed().isSafeAttribute("tag", new Element(), new Attribute("", "")));
    }

    @Test
    public void preserveRelativeLinks_DontPreserve_ReturnsSame() {
        when(tags).thenReturn(new HashSet<>(java.util.Collections.singletonList("tag")));
        Safelist result = Safelist.relaxed().preserveRelativeLinks(false);
        assertNotNull(result);
        assertFalse(Safelist.relaxed().isSafeAttribute("tag", new Element(), new Attribute("", "")));
    }

}