package org.jsoup.nodes;

public class GeneratedTestRemoveIgnoreCase {

    @Test
    public void testRemoveIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.removeIgnoreCase("KEY1");
        assert attrs.size() == 0;
    }

}