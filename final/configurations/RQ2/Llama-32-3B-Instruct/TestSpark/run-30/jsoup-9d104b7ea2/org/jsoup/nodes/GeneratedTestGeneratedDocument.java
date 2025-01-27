package org.jsoup.nodes;

public class GeneratedTestGeneratedDocument {

    protected String input;

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }
}

@Test
public void testGeneratedDocument() {
    Document document = new Document("Hello>  World");
    output = document.toString();
    String trimmedInput = StringUtil.stripLeadingWhitespace(input);
    assertEquals("Hello>  World", trimmedInput);
}
		}

public class Document {
    private String value;

    public Document(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}