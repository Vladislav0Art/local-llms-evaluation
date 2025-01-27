package com.crowdin.client.core.http.impl.json;

public class GeneratedConvertImportOptionsToJSON_WhenObjectIsCorrectThenSuccess {

    private JacksonJsonTransformer transformer;

    @Before
    public void setUp() {
        this.transformer = new JacksonJsonTransformer();
    }

    @Test
    public void convertImportOptionsToJSON_WhenObjectIsCorrectThenSuccess() throws CrowdinApiException, HttpBadRequestException, HttpException {
        ImportOptions importOptions = new ImportOptions(1, Arrays.asList(), Arrays.asList());
        String json = transformer.convert(importOptions);
        assertEquals("{\"project_id\": 1,\"group_ids\": [],\"groups\": [\"123456\",\"Group Name\"]}", json);
    }

}