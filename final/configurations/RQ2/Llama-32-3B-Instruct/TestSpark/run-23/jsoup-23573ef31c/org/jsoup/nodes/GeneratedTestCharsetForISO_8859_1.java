package org.jsoup.nodes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class GeneratedTestCharsetForISO_8859_1 {

    @BeforeAll
    public static void beforeAll() {
        Document.create();
    }

    @AfterAll
    public static void afterAll() {
        Document.destroy();
    }

    @Test
    public void testCharsetForISO_8859_1() {
        Charset charset = Charset.forName("ISO-8859-1");
        Assert.assertEquals("ISO-8859-1", charset.name());
    }
}

public class Document {

    private static Node node;

    public static void create() throws Exception {
        if (node == null) {
            // some initialization code
            node = new Node();
        }
    }

    public static void destroy() throws Exception {
        if (node != null) {
            // some cleanup code
            node = null;
        }
    }

    public static Node getNode() {
        return node;
    }
}

public class Parser {

    private int errors;

    public static Parser create() {
        return new Parser();
    }

    public void setErrorCount(int errorCount) {
        this.errors = errorCount;
    }

    public int getErrors() {
        return errors;
    }
}

public class OutputSettings {

    private String value = "";

    public static OutputSettings create() {
        return new OutputSettings();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String newValue) {
        this.value = newValue;
    }
}

}