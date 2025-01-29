package org.jsoup.safety;

public class GeneratedTestIsSafeTag {

    public Element getTag(String tagName) {
        return new Element(tagName);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    public List<String> getAttributes(String attributeName) {
        String[] attributes = new String[1];
        attributes[0] = attributeName;
        return new ArrayList<>(Arrays.asList(attributes));
    }
}

class Element {
    public String tagName;

    public Element(String tagName) {
        this.tagName = tagName;
    }
}

public class TestSpark extends TestCase {

    private GeneratedTest test;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        test = new GeneratedTest();
    }

    @Test
    public void testIsSafeTag() {
        assertTrue(test.isSafeTag("tag"));
    }

}