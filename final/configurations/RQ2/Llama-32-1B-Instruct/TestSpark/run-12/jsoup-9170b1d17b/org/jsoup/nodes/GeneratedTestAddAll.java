package org.jsoup.nodes;

public class GeneratedTestAddAll {

    @Test
    public void testAddAll() {
        Attributes attrs = new Attributes();
        List<Attribute> incoming = Arrays.asList(new Attr("key1", "value1"), new Attr("key2", "value2"));
        attrs.addAll(incoming);
        assert attrs.size() == 2;
    }

}