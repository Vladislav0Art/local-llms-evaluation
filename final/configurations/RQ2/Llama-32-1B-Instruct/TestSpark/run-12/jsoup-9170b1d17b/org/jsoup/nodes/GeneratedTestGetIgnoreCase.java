package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCase {

    @Test
    public void testGetIgnoreCase() {
        Attributes attrs = new Attributes();
        assert attrs.getKeyIgnoreCase("KEY1") == null;
        attrs.add("KEY2", "value2");
        assert attrs.getIgnoreCase("KEY2") == "value2";
    }

}