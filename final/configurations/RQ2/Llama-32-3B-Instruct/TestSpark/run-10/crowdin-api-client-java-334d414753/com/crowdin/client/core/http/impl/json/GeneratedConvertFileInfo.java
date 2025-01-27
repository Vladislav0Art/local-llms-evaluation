package com.crowdin.client.core.http.impl.json;

public class GeneratedConvertFileInfo {

    private JacksonJsonTransformer jsonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertFileInfo() {
        FileInfo fileInfo = new FileInfo("file1.txt", 1024, "/path/to/file1.txt");
        String expectedJson = "{\"name\":\"file1.txt\",\"size\":1024,\"path\":\"/path/to/file1.txt\"}";
        assertSame(expectedJson, jsonJsonTransformer.convert(fileInfo));
    }

}