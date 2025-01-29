package org.jsoup.nodes;

public class GeneratedTestPutIgnoreCase {

    @Test
    public void testPutIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.putIgnoreCase("KEY1", "value1");
        assert attrs.getIgnoreCase("KEY1") == "value1";
    }

}