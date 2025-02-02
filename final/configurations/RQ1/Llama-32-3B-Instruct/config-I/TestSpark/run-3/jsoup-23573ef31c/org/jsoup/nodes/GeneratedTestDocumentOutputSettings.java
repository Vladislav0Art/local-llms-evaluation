package org.jsoup.nodes;

public class GeneratedTestDocumentOutputSettings {


    private final String content;
    private final Parser parser;
    private Connection connection;

    public static Document createDocument(String content, Parser parser) {
        return new Document(content, parser);
    }

    public OutputSettings outputSettings() {
        return outputSettings;
    }

    public Document outputSettings(OutputSettings outputSettings) {
        Validate.notNull(outputSettings);
        this.outputSettings = outputSettings;
        return this;
    }

    public Document connection(Connection connection) {
        Validate.notNull(connection);
        this.connection = connection;
        return this;
    }

    public Document quirksMode(QuirksMode quirksMode) {
        this.quirksMode = quirksMode;
        return this;
    }

    public Document parser(Parser parser) {
        this.parser = parser;
        return this;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", parser=" + parser +
                '}';
    }
}

public class Parser {

    private final String name;

    public static Parser createParser(String name) {
        return new Parser(name);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parser parser = (Parser) o;
        return Objects.equals(name, parser.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class OutputSettings {

    private final QuirksMode quirksMode;
    private final String content;
    private final Parser parser;

    public static OutputSettings createOutputSettings(QuirksMode quirksMode, Parser parser) {
        return new OutputSettings(quirksMode, "", parser);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutputSettings settings = (OutputSettings) o;
        return Objects.equals(quirksMode, settings.quirksMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quirksMode);
    }
}

public enum QuirksMode {
    noQuirks,
    quirks,
    limitedQuirks
}

class DocumentTest {

    @Test
    public void testDocumentOutputSettings() {
        OutputSettings outputSettings = OutputSettings.createOutputSettings(QuirksMode.noQuirks, Parser.createParser("parser"));
        Document document = Document.createDocument("<html>content</html>", Parser.createParser("parser"));
        DocumentBuilder builder = new DocumentBuilder();
        Document document2 = builder.document()
                .outputSettings(outputSettings)
                .build();
    }

}