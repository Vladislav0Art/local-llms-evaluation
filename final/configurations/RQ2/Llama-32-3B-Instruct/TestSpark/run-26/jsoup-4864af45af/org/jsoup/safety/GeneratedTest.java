package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void none() {
        boolean isSafeTag = Safelist.none().isSafeTag("img");
        assertTrue(isSafeTag);
    }
}

@Test
public void simpleTextAddTags() {
    String[] tags = {"a", "b"};
    Safelist safelist = Safelist.simpleText().addTags(tags);
    boolean isSafeTag = safelist.isSafeTag("a");
    assertTrue(isSafeTag);
}

@Test
public void simpleTextRemoveTags() {
    String[] tags = {"a", "b"};
    Safelist safelist = Safelist.simpleText().removeTags(tags);
    boolean isSafeTag = safelist.isSafeTag("c");
    assertFalse(isSafeTag);
}
	}

@Test
public void basicAddTags() {
    String[] tags = {"a", "b"};
    Safelist safelist = Safelist.basic().addTags(tags);
    boolean isSafeTag = safelist.isSafeTag("a");
    assertTrue(isSafeTag);
}

@Test
public void basicRemoveTags() {
    String[] tags = {"a", "b"};
    Safelist safelist = Safelist.basic().removeTags(tags);
    boolean isSafeTag = safelist.isSafeTag("c");
    assertFalse(isSafeTag);
}
	}

@Test
public void basicWithImagesAddTags() {
    String[] tags = {"img", "a"};
    Safelist safelist = Safelist.basicWithImages().addTags(tags);
    boolean isSafeTag = safelist.isSafeTag("img");
    assertTrue(isSafeTag);
}

@Test
public void basicWithImagesRemoveTags() {
    String[] tags = {"img", "a"};
    Safelist safelist = Safelist.basicWithImages().removeTags(tags);
    boolean isSafeTag = safelist.isSafeTag("b");
    assertFalse(isSafeTag);
}
	}

@Test
public void relaxedAddTags() {
    String[] tags = {"a", "b"};
    Safelist safelist = Safelist.relaxed().addTags(tags);
    boolean isSafeTag = safelist.isSafeTag("a");
    assertTrue(isSafeTag);
}

@Test
public void relaxedRemoveTags() {
    String[] tags = {"a", "b"};
    Safelist safelist = Safelist.relaxed().removeTags(tags);
    boolean isSafeTag = safelist.isSafeTag("c");
    assertFalse(isSafeTag);
}
	}

@Test
public void basicWithImagesAddAttributes() {
    String tag = "img";
    String[] attributes = {"alt", "src"};
    Safelist safelist = Safelist.basicWithImages().addAttributes(tag, attributes);
    Attributes enforcedAttributes = safelist.getEnforcedAttributes(tag);
    // Assuming getEnforcedAttributes returns an object that has a method to check if a key exists
    boolean isSafeAttribute = enforcedAttributes.containsKey("alt");
    assertTrue(isSafeAttribute);
}

@Test
public void basicWithImagesRemoveAttributes() {
    String tag = "img";
    String[] attributes = {"alt", "src"};
    Safelist safelist = Safelist.basicWithImages().removeAttributes(tag, attributes);
    Attributes enforcedAttributes = safelist.getEnforcedAttributes(tag);
    boolean isSafeAttribute = !enforcedAttributes.containsKey("alt");
    assertTrue(isSafeAttribute);
}
	}

@Test
public void basicWithImagesRemoveEnforcedAttributes() {
    String tag = "img";
    String attribute = "src";
    Safelist safelist = Safelist.basicWithImages().addEnforcedAttribute(tag, attribute, "image.jpg");
    safelist = safelist.removeEnforcedAttribute(tag, attribute);
    Attributes enforcedAttributes = safelist.getEnforcedAttributes(tag);
    boolean isSafeAttribute = !enforcedAttributes.containsKey(attribute);
    assertTrue(isSafeAttribute);
}
	}

@Test
public void preserveRelativeLinksPreserve() {
    boolean preserve = true;
    Safelist safelist = Safelist.preserveRelativeLinks(preserve).addTags("a", "b");
    boolean isSafeTag = safelist.isSafeTag("a");
    assertTrue(isSafeTag);
}

@Test
public void preserveRelativeLinksDoNotPreserve() {
    boolean preserve = false;
    Safelist safelist = Safelist.preserveRelativeLinks(preserve).addTags("a", "b");
    boolean isSafeTag = safelist.isSafeTag("c");
    assertFalse(isSafeTag);
}
	}

@Test
public void addProtocols() {
    String tag = "img";
    String attribute = "src";
    String[] protocols = {"http", "https"};
    Safelist safelist = Safelist.addProtocols(tag, attribute, protocols).addTags("a", "b");
    boolean isSafeAttribute = safelist.isSafeAttribute(tag, null, new Attribute(attribute, protocols));
    assertTrue(isSafeAttribute);
}

@Test
public void removeProtocols() {
    String tag = "img";
    String attribute = "src";
    Safelist safelist = Safelist.removeProtocols(tag, attribute, new String[]{"http", "https"}).addTags("a", "b");
    boolean isSafeAttribute = !safelist.isSafeAttribute(tag, null, new Attribute(attribute));
    assertTrue(isSafeAttribute);
}

}