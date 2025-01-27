package com.crowdin.client.core.http.impl.json;

public class GeneratedConvertFileInfoToJSON_WhenObjectIsCorrectThenSuccess {

    private JacksonJsonTransformer transformer;

    @Before
    public void setUp() {
        this.transformer = new JacksonJsonTransformer();
    }

    @Test
    public void convertFileInfoToJSON_WhenObjectIsCorrectThenSuccess() throws CrowdinApiException, HttpBadRequestException, HttpException {
        FileInfo fileInfo = new FileInfo(1, Arrays.asList(), Arrays.asList());
        String json = transformer.convert(fileInfo);
        assertEquals("{\"project_id\": 1,\"group_ids\": [],\"groups\": [\"123456\",\"Group Name\"]}", json);
    }

}