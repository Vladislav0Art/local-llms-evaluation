package org.jsoup.safety;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        String tag = "div";
        String[] attributes = {"class", "id"};
        safelist.addAttributes(tag, attributes);

        assertTrue(safelist.isSafeAttribute(tag, null, new Attribute("class", "myClass")));
        assertTrue(safelist.isSafeAttribute(tag, null, new Attribute("id", "myId")));
    }

}