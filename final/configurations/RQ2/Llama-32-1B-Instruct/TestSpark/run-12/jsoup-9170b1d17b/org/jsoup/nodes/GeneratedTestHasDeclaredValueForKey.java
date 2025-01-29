package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKey {

    @Test
    public void testHasDeclaredValueForKey() {
        Attributes attrs = new Attributes();
        assert attrs.hasDeclaredValueForKey("key1") == false;
        attrs.add("key2", "value2");
        assert attrs.hasDeclaredValueForKey("key2") == true;
    }

}