package org.jsoup.nodes;

public class GeneratedTestTitle {

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

}