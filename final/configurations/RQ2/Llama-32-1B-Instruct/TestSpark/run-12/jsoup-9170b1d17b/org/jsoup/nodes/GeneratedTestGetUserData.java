package org.jsoup.nodes;

public class GeneratedTestGetUserData {

    @Test
    public void testGetUserData() {
        Attributes attrs = new Attributes();
        assert attrs.getUserData("key1") == null;
        attrs.put("key1", "value1");
        assert attrs.getUserData("key1") == "value1";
    }

}