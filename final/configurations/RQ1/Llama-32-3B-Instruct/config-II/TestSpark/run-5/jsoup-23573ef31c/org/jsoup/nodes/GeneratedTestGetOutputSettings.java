package org.jsoup.nodes;

public class GeneratedTestGetOutputSettings {

    private String text;

    public Document(String text) {
        this.text = text;
    }

    public static class OutputSettings {
        // fields...
    }

    public OutputSettings outputSettings() {
        return new OutputSettings();
    }

    public Document outputSettings(OutputSettings outputSettings) {
        return this;
    }
}

public interface Parser {
}

public interface Connection {
}

public class NoParser implements Parser {
}

public class StandardConnection implements Connection {
}

class MockDocument extends Document {

    @Test
    public void testGetOutputSettings() {
        MockDocument mockDocument = new MockDocument();
        OutputSettings outputSettings = mockDocument.outputSettings();
        Assert.notNull(outputSettings, "outputSettings is null");
    }
}

}