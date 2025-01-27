package com.crowdin.client.core.http.impl.json;

public class GeneratedTestClassFileInfo {

    @Test
    public void testClassFileInfo() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFileName("test-file-name");
        assertEquals("test-file-name", fileInfo.getFileName());
    }

}