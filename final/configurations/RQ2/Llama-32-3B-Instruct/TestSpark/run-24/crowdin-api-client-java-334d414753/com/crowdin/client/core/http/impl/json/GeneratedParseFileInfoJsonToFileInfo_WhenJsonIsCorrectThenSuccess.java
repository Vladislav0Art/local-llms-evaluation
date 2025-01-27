package com.crowdin.client.core.http.impl.json;

public class GeneratedParseFileInfoJsonToFileInfo_WhenJsonIsCorrectThenSuccess {

    private JacksonJsonTransformer transformer;

    @Before
    public void setUp() {
        this.transformer = new JacksonJsonTransformer();
    }

    @Test
    public void parseFileInfoJsonToFileInfo_WhenJsonIsCorrectThenSuccess() throws CrowdinApiException, HttpBadRequestException, HttpException {
        String json = "{\"project_id\": 1,\"group_ids\":[],\"groups\":[{\"id\":\"123456\",\"name\":\"Group Name\"}]}";
        FileInfo fileInfo = (FileInfo) transformer.parse(json, FileInfo.class);
        assertNotNull(fileInfo);
    }

}