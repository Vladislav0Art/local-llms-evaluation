package org.jsoup.nodes;

public class GeneratedTestIndentAmount {

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
    public void testIndentAmount() {
        OutputSettings outputSettings = new OutputSettings().setIndentAmount(4);
        assertEquals(4, outputSettings.getIndentAmount());
    }
}

public class Parser {
    private String[] rules;

    public String[] getRules() {
        return rules;
    }

    public Parser setRules(String[] rules) {
        this.rules = rules;
        return this;
    }
}

}