package org.jsoup.nodes;

public class GeneratedTest {

    protected String input;

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }
}

@Test
public void beforeAll() {
    private String output;

    @BeforeAll
    public void beforeAll () {
        super.beforeClass();
    }

    @AfterAll
    public void afterAll () {
        super.tearDownClass();
    }

    @Test
    public void testGeneratedDocument () {
        Document document = new Document("Hello>  World");
        output = document.toString();
        assertEquals("Hello>  World", StringUtil.normaliseWhitespace(input));
        assertEquals("Hello>  World", StringUtil.stripLeadingWhitespace(input));
    }
}

public class StringUtil {
    public static String normaliseWhitespace(String input) {
        return input.replaceAll("\\s+", " ");
    }

    public static String stripLeadingWhitespace(String input) {
        return input.trim();
    }
}

@Test
public void beforeAll() {
    private String output;

    @BeforeAll
    public void beforeAll () {
        super.beforeClass();
    }

    @AfterAll
    public void afterAll () {
        super.tearDownClass();
    }

    @Test
    public void testGeneratedDocument () {
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