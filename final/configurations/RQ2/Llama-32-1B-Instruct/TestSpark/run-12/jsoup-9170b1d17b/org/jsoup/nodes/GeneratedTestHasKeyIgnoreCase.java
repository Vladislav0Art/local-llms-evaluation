package org.jsoup.nodes;

public class GeneratedTestHasKeyIgnoreCase {

    @Test
    public void testHasKeyIgnoreCase() {
        Attributes attrs = new Attributes();
        assert attrs.hasKeyIgnoreCase("KEY1") == false;
        attrs.add("key2", "value2");
        assert attrs.hasKeyIgnoreCase("KEY2") == true;
    }

}