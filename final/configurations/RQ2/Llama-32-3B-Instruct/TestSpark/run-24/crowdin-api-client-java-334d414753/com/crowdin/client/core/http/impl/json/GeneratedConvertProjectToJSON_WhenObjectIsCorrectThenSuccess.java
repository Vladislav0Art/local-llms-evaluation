package com.crowdin.client.core.http.impl.json;

public class GeneratedConvertProjectToJSON_WhenObjectIsCorrectThenSuccess {

    private JacksonJsonTransformer transformer;

    @Before
    public void setUp() {
        this.transformer = new JacksonJsonTransformer();
    }

    @Test
    public void convertProjectToJSON_WhenObjectIsCorrectThenSuccess() throws CrowdinApiException, HttpBadRequestException, HttpException {
        Project project = new Project(1, Arrays.asList(), Arrays.asList());
        String json = transformer.convert(project);
        assertEquals("{\"project_id\": 1,\"group_ids\": [],\"groups\": [\"123456\",\"Group Name\"]}", json);
    }

}