package org.jsoup.nodes;

public class GeneratedTestDocument {

    // ...

    public OutputSettings outputSettings() {
        return outputSettings;
    }

    public Document outputSettings(OutputSettings outputSettings) {
        Validate.notNull(outputSettings);
        this.outputSettings = outputSettings;
        return this;
    }

    public Parser parser() {
        return parser;
    }

    public Document parser(Parser parser) {
        this.parser = parser;
        return this;
    }
}

public class OutputSettings {
    // ...

    public OutputSettings indentAmount(int indentAmount) {
        Validate.isTrue(indentAmount >= 0);
        this.indentAmount = indentAmount;
        return this;
    }

    public OutputSettings maxPaddingWidth(int maxPaddingWidth) {
        Validate.isTrue(maxPaddingWidth >= -1);
        this.maxPaddingWidth = maxPaddingWidth;
        return this;
    }
}

public class Parser {
    // ...
}

public class QuirksMode {
    // ...
}

public class DocumentTest {

    @Test
    public void testDocument() {
        Document document = new Document();
        OutputSettings outputSettings = new OutputSettings();
        Parser parser = new Parser();
        document.outputSettings(outputSettings);
        document.parser(parser);
    }

}