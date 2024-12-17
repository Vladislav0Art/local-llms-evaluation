package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestDocument {

    @Test
    public void testDocument() {
        Document document = new Document();
        document.setOutputSettings(new OutputSettings());
        assertTrue(document.toString().contains("<!"));
        assertFalse(document.toString().contains(">"));
    }
}

class Comment {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

class Document {
    private OutputSettings outputSettings;

    public void setOutputSettings(OutputSettings outputSettings) {
        this.outputSettings = outputSettings;
    }

    public OutputSettings getOutputSettings() {
        return outputSettings;
    }

    @Override
    public String toString() {
        return "<html>" + this.outputSettings.toString() + "</html>";
    }
}

class OutputSettings {
    private String string;

    public void setString(String string) {
        this.string = string;
    }

    public String toString() {
        return "OutputSettings: " + string;
    }

}