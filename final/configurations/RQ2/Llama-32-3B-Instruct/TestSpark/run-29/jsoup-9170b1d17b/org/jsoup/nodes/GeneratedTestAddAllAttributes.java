package org.jsoup.nodes;

public class GeneratedTestAddAllAttributes {

    private List<String> list;

    public Attributes() {
    }

    public void addAll(Attributes attributes) {
        this.list.addAll(attributes.list);
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public Iterator<String> iterator() {
        return this.list.iterator();
    }

    public static boolean isNormalizer(Attributes a, Attributes b) {
        // check if this is a normalizer
        return true;
    }

    public String internalKey() {
        return "test";
    }

    public void setInternalKey(String key) {
        this.internalKey = key;
    }
}

public class TestSpark {

    @Test
    public void testAddAllAttributes() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();
        attributes1.addAll(attributes2);
        assertEquals(0, attributes1.size());
    }

}