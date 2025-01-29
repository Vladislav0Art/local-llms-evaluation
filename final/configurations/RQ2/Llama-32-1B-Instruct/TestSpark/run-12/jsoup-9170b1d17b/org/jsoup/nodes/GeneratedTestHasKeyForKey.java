package org.jsoup.nodes;

public class GeneratedTestHasKeyForKey {

    @Test
    public void testHasKeyForKey() {
        Attributes attrs = new Attributes();
        assert attrs.hasKey("key1") == false;
        attrs.put("key1", "value1");
        assert attrs.hasKey("key1") == true;
    }

}