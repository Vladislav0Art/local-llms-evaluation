package org.jsoup.nodes;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        Attributes attrs = new Attributes();
        assert attrs.getKey("key1") == null;
        attrs.add("key2", "value2");
        assert attrs.get("key2") == "value2";
    }

}