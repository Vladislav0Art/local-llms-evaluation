package org.jsoup.safety;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        String tag = "div";
        String attribute = "id";
        safelist.removeEnforcedAttribute(tag, attribute);

        assertFalse(safelist.isSafeAttribute(tag, null, new Attribute("id", "myId")));
    }

}