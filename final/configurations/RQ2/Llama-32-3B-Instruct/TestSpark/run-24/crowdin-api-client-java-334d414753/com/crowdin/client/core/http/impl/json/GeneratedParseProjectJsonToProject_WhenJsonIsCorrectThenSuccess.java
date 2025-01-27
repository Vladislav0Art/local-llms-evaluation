package com.crowdin.client.core.http.impl.json;

public class GeneratedParseProjectJsonToProject_WhenJsonIsCorrectThenSuccess {

    private JacksonJsonTransformer transformer;

    @Before
    public void setUp() {
        this.transformer = new JacksonJsonTransformer();
    }

    @Test
    public void parseProjectJsonToProject_WhenJsonIsCorrectThenSuccess() throws CrowdinApiException, HttpBadRequestException, HttpException {
        String json = "{\"project_id\": 1,\"group_ids\":[],\"groups\":[{\"id\":\"123456\",\"name\":\"Group Name\"}]}";
        Project project = (Project) transformer.parse(json, Project.class);
        assertNotNull(project);
    }

}