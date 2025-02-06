package org.jsoup.nodes;

public class GeneratedUpdateMetaCharsetElementMethod_TurnsUpdateFlagToTrue {

    @Test
    public void updateMetaCharsetElementMethod_TurnsUpdateFlagToTrue() {
        boolean flag = false;
        Document doc = Document.createShell("");
        doc.updateMetaCharsetElement(true);
        assertTrue(flag);
    }

}