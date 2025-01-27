package com.crowdin.client.core.http.impl.json;

public class GeneratedConvertExportOptionsToJSON_WhenObjectIsCorrectThenSuccess {

    private JacksonJsonTransformer transformer;

    @Before
    public void setUp() {
        this.transformer = new JacksonJsonTransformer();
    }

    @Test
    public void convertExportOptionsToJSON_WhenObjectIsCorrectThenSuccess() throws CrowdinApiException, HttpBadRequestException, HttpException {
        ExportOptions exportOptions = new ExportOptions(1, Arrays.asList(), Arrays.asList());
        String json = transformer.convert(exportOptions);
        assertEquals("{\"project_id\": 1,\"group_ids\": [],\"groups\": [\"123456\",\"Group Name\"]}", json);
    }

}