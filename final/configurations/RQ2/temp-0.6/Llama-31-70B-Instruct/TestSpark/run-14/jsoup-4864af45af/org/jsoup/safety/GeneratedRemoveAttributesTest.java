package org.jsoup.safety;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        String tag = "div";
        String[] attributes = {"class", "id"};
        safelist.removeAttributes(tag, attributes);

        assertFalse(safelist.isSafeAttribute(tag, null, new Attribute("class", "myClass")));
        assertFalse(safelist.isSafeAttribute(tag, null, new Attribute("id", "myId")));
    }

}