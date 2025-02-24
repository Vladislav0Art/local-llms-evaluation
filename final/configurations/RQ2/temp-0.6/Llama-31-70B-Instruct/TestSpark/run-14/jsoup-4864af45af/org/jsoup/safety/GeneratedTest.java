package org.jsoup.safety;

public class GeneratedTest {

    @Test
    public void addAttributesTest() {
        String tag = "div";
        String[] attributes = {"class", "id"};
        safelist.addAttributes(tag, attributes);

        assertTrue(safelist.isSafeAttribute(tag, null, new Attribute("class", "myClass")));
        assertTrue(safelist.isSafeAttribute(tag, null, new Attribute("id", "myId")));
    }

    @Test
    public void removeAttributesTest() {
        String tag = "div";
        String[] attributes = {"class", "id"};
        safelist.removeAttributes(tag, attributes);

        assertFalse(safelist.isSafeAttribute(tag, null, new Attribute("class", "myClass")));
        assertFalse(safelist.isSafeAttribute(tag, null, new Attribute("id", "myId")));
    }

    @Test
    public void addEnforcedAttributeTest() {
        String tag = "div";
        String attribute = "id";
        String value = "myId";
        safelist.addEnforcedAttribute(tag, attribute, value);

        assertTrue(safelist.isSafeAttribute(tag, null, new Attribute("id", "myId")));
        assertFalse(safelist.isSafeAttribute(tag, null, new Attribute("id", "otherId")));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        String tag = "div";
        String attribute = "id";
        safelist.removeEnforcedAttribute(tag, attribute);

        assertFalse(safelist.isSafeAttribute(tag, null, new Attribute("id", "myId")));
    }

    @Test
    public void preserveRelativeLinksTest() {
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.preserveRelativeLinks());

        safelist.preserveRelativeLinks(false);
        assertFalse(safelist.preserveRelativeLinks());
    }

}