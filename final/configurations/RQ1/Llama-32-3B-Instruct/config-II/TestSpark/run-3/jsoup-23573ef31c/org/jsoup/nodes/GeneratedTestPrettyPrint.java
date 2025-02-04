package org.jsoup.nodes;

public class GeneratedTestPrettyPrint {

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
    public void testPrettyPrint() {
        OutputSettings outputSettings = new OutputSettings().setPrettyPrint(true);
        assertTrue(outputSettings.isPrettyPrint());
    }

}