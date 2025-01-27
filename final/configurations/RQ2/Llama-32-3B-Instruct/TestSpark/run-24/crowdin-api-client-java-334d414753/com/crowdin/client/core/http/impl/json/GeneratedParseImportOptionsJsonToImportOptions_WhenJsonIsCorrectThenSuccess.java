package com.crowdin.client.core.http.impl.json;

public class GeneratedParseImportOptionsJsonToImportOptions_WhenJsonIsCorrectThenSuccess {

    private JacksonJsonTransformer transformer;

    @Before
    public void setUp() {
        this.transformer = new JacksonJsonTransformer();
    }

    @Test
    public void parseImportOptionsJsonToImportOptions_WhenJsonIsCorrectThenSuccess() throws CrowdinApiException, HttpBadRequestException, HttpException {
        String json = "{\"project_id\": 1,\"group_ids\":[],\"groups\":[{\"id\":\"123456\",\"name\":\"Group Name\"}]}";
        ImportOptions importOptions = (ImportOptions) transformer.parse(json, ImportOptions.class);
        assertNotNull(importOptions);
    }

}