package org.jsoup.nodes;

public class GeneratedTestPutUserData {

    @Test
    public void testPutUserData() {
        Attributes attrs = new Attributes();
        attrs.put("key2", "value2");
        assert attrs.getUserData("key2") == null;
        attrs.putUserData("key2", "new value2");
        assert attrs.getUserData("key2") == "new value2";
    }

}