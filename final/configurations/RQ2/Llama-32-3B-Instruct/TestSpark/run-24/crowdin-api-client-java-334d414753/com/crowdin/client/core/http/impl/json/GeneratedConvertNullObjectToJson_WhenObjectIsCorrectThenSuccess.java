package com.crowdin.client.core.http.impl.json;

public class GeneratedConvertNullObjectToJson_WhenObjectIsCorrectThenSuccess {

    private JacksonJsonTransformer transformer;

    @Before
    public void setUp() {
        this.transformer = new JacksonJsonTransformer();
    }

    @Test
    public void convertNullObjectToJson_WhenObjectIsCorrectThenSuccess() throws CrowdinApiException, HttpBadRequestException, HttpException {
        String json = transformer.convert(null);
        assertEquals("{\"project_id\": null,\"group_ids\": [],\"groups\": [null,null]}", json);
    }

}