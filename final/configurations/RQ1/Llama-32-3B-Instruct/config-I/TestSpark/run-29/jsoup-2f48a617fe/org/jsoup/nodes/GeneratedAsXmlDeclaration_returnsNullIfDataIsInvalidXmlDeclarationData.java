package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAsXmlDeclaration_returnsNullIfDataIsInvalidXmlDeclarationData {

    @Test
    public void asXmlDeclaration_returnsNullIfDataIsInvalidXmlDeclarationData() {
        Comment comment = new Comment("Hello World!");
        assertNull(comment.asXmlDeclaration());
    }
}

class MockParser {
    private String parsedData;

    public void setParsedData(String data) {
        this.parsedData = data;
    }

    public String getParsedData() {
        return parsedData;
    }
}

}