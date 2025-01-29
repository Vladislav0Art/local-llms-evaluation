package org.jsoup.nodes;

public class GeneratedTestPutValue {

    @Test
    public void testPutValue() {
        Attributes attrs = new Attributes();
        attrs.putValue(true);
        assert attrs.get("value1") == null;
        assert attrs.get("value2") == true;
    }

}