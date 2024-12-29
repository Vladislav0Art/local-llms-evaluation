package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForUserDataKey {

    @Test
    public void testHasDeclaredValueForUserDataKey() {
        Attributes attributes = new Attributes();
        attributes.putUserData("user_data", "value");
        assertEquals(1, attributes.size());
    }

}