package org.jsoup.nodes;

public class GeneratedTestHasKeyIgnoreCaseForKey {

    @Test
    public void testHasKeyIgnoreCaseForKey() {
        Attributes attrs = new Attributes();
        assert attrs.hasKeyIgnoreCase("KEY1") == false;
        attrs.add("key2", "value2");
        assert attrs.hasKeyIgnoreCase("KEY2") == true;
    }

}