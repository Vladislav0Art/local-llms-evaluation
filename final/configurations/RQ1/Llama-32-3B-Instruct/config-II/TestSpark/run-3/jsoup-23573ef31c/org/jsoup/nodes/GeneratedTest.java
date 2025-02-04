package org.jsoup.nodes;

public class GeneratedTest {

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
    public void testTitle() {
        Document document = new Document().setTitle("Hello, World!");
        assertEquals("Hello, World!", document.getTitle());
    }
}

public class OutputSettings {
    private boolean prettyPrint;
    private int indentAmount;

    public boolean isPrettyPrint() {
        return prettyPrint;
    }

    public OutputSettings setPrettyPrint(boolean prettyPrint) {
        this.prettyPrint = prettyPrint;
        return this;
    }

    public int getIndentAmount() {
        return indentAmount;
    }

    public OutputSettings setIndentAmount(int indentAmount) {
        this.indentAmount = indentAmount;
        return this;
    }
}

@Test
public void testPrettyPrint() {
    OutputSettings outputSettings = new OutputSettings().setPrettyPrint(true);
    assertTrue(outputSettings.isPrettyPrint());
}

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

@Test
public void testGetRules() {
    Parser parser = new Parser().setRules(new String[]{"rule1", "rule2"});
    assertEquals(new String[]{"rule1", "rule2"}, parser.getRules());
}

}