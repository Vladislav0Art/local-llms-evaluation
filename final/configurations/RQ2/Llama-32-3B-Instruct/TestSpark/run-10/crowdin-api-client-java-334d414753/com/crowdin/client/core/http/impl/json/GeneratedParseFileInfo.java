package com.crowdin.client.core.http.impl.json;

public class GeneratedParseFileInfo {

    private JacksonJsonTransformer jsonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseFileInfo() {
        String json = "{\"name\":\"file1.txt\",\"size\":1024,\"path\":\"/path/to/file1.txt\"}";
        FileInfo expectedFileInfo = new FileInfo("file1.txt", 1024, "/path/to/file1.txt");
        assertSame(expectedFileInfo, jsonJsonTransformer.parse(json, FileInfo.class));
    }

}