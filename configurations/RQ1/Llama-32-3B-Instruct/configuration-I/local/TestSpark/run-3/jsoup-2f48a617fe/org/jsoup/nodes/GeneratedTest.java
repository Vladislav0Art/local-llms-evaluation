package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void newCommentHasCorrectData() {
        Comment comment = new Comment("Hello World!");
        assertEquals("Hello World!", comment.getData());
    }

    @Test
    public void settingDataOnExistingCommentUpdatesCorrectly() {
        Comment comment = new Comment("Hello");
        comment.setData("World");
        assertEquals("World", comment.getData());
    }

    @Test
    public void cloneCreatesNewComment() {
        Comment comment = new Comment("Hello World!");
        Comment cloned = comment.clone();
        assertNotSame(comment, cloned);
        assertEquals("Hello World!", cloned.getData());
    }

    @Test
    public void isXmlDeclarationIsFalseForCommentsWithoutXmlData() {
        Comment comment = new Comment("Hello");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationIsNotNullWhenGivenCorrectData() {
        Comment comment = new Comment("<?xml version=\"1.0\" encoding=\"UTF-8\"?><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

    @Test
    public void asXmlDeclarationIsNullWhenGivenIncorrectData() {
        Comment comment = new Comment("Hello World!");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNull(xmlDeclaration);
    }

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