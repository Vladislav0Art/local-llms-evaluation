package org.jsoup.nodes;

public class GeneratedTestHasKey {

    @Test
    public void testHasKey() {
        Attributes attrs = new Attributes();
        assert attrs.hasKey("key1") == false;
        attrs.add("key2", "value2");
        assert attrs.hasKey("key2") == true;
    }

}