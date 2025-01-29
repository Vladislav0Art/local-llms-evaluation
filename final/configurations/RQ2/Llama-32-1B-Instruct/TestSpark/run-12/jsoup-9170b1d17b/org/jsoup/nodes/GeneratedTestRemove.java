package org.jsoup.nodes;

public class GeneratedTestRemove {

    @Test
    public void testRemove() {
        Attributes attrs = new Attributes();
        attrs.remove("key1");
        assert attrs.size() == 0;
    }

}