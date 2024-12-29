package org.jsoup.nodes;

public class GeneratedTestRemoveAllAttributesWithUserData {

    @Test
    public void testRemoveAllAttributesWithUserData() {
        Attributes attributes = new Attributes();
        attributes.removeUserData("user_data");
        assertEquals(0, attributes.size());
    }

}