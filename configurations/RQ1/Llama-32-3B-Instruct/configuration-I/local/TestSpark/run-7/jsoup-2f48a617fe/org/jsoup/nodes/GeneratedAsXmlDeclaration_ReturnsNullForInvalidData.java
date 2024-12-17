package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_ReturnsNullForInvalidData {

    @Test
    public void asXmlDeclaration_ReturnsNullForInvalidData() {
        Comment comment = new Comment("");
        XmlDeclaration result = comment.asXmlDeclaration();
        assertNull(result);
    }
}

public class AppendableMock implements Appendable {
    private StringBuilder content = new StringBuilder();

    @Override
    public boolean append(CharSequence csq) {
        content.append(csq);
        return true;
    }

    @Override
    public boolean append(CharSequence csq, int start, int end) {
        content.append(csq, start, end);
        return true;
    }

    public String toString() {
        return content.toString();
    }
}

public class DocumentOutputSettingsMock extends Document.OutputSettings {
    private Appendable accum = new AppendableMock();

    @Override
    public void append(Appendable appendable) {
        accum.append(appendable);
    }

}