package org.jsoup.safety;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        String tag = "div";
        String attribute = "id";
        String value = "myId";
        safelist.addEnforcedAttribute(tag, attribute, value);

        assertTrue(safelist.isSafeAttribute(tag, null, new Attribute("id", "myId")));
        assertFalse(safelist.isSafeAttribute(tag, null, new Attribute("id", "otherId")));
    }

}