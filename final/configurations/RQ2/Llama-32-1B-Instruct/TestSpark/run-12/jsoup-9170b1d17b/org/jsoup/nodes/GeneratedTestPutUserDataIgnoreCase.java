package org.jsoup.nodes;

public class GeneratedTestPutUserDataIgnoreCase {

    @Test
    public void testPutUserDataIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.putUserDataIgnoreCase("key2", "new value2");
        assert attrs.getUserData("key2") == null;
        attrs.putUserDataIgnoreCase("key2", "new value2");
        assert attrs.getUserData("key2") == "new value2";
    }

}