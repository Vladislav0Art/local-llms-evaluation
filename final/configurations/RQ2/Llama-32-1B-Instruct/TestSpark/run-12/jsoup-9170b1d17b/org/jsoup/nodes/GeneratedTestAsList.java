package org.jsoup.nodes;

public class GeneratedTestAsList {

    @Test
    public void testAsList() {
        Attributes attrs = new Attributes();
        List<Attribute> list = attrs.asList();
        assert list.size() == 0;
        list.add(new Attr("key2", "value2"));
        assert list.size() == 1;
    }

}