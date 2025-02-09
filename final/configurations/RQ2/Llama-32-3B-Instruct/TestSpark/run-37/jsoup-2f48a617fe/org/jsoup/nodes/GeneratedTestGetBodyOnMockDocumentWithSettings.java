package org.jsoup.nodes;

public class GeneratedTestGetBodyOnMockDocumentWithSettings {

    @Test
    public void testGetBodyOnMockDocumentWithSettings() {
        MockDocument mockDoc = new MockDocument();
        Appendable body = mockDoc.body();
        mockDoc.setComment(body);
    }

}