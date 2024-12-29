package org.jsoup.nodes;

public class GeneratedTestRemoveAttributeUserData {

    @Test
    public void testRemoveAttributeUserData() {
        Attributes attributes = new Attributes();
        attributes.removeUserData("user_data");
        assertEquals(1, attributes.size());
    }

}