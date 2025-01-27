package org.jsoup.nodes;

public class GeneratedTestExpectedForms {

    public Document document;
    public Parser parser = new Parser();
    public QuirksMode quirksMode;

    @Test
    public void testExpectedForms() {
        List<FormElement> expectedForms = new ArrayList<>();
        FormElement formElement1 = new FormElement("input", "test", null);
        expectedForms.add(formElement1);
        assertEquals(1, expectedForms.size());
    }
}

public class Document {
    private String baseUri;

    public void createShell(String shell) {
    }
}

public class Parser {
}

public class QuirksMode {
}

public class Connection {
    public Document get() {
        return new Document();
    }
}

public class FormElement {
    public String type;
    public String name;
    public String value;

    public FormElement(String type, String name, String value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

}