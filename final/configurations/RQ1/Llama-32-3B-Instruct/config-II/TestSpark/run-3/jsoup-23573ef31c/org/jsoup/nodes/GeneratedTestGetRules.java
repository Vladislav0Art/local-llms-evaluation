package org.jsoup.nodes;

public class GeneratedTestGetRules {

    private String title;

    public String getTitle() {
        return title;
    }

    public Document setTitle(String title) {
        this.title = title;
        return this;
    }
}

class TestDocument {

    @Test
    public void testGetRules() {
        Parser parser = new Parser().setRules(new String[]{"rule1", "rule2"});
        assertEquals(new String[]{"rule1", "rule2"}, parser.getRules());
    }

}