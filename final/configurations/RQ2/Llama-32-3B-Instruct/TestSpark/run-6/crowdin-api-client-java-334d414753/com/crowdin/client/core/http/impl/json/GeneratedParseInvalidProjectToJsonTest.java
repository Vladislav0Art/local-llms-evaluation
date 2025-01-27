package com.crowdin.client.core.http.impl.json;

public class GeneratedParseInvalidProjectToJsonTest {

    private JacksonJsonTransformer jsonTransformer;

    @Before
    public void setUp() {
        jsonTransformer = new JacksonJsonTransformer();
    }

    @Test
    public void parseInvalidProjectToJsonTest() {
        String json = "{\"invalid\":\"json\"}";
        Class<Project> clazz = Project.class;
        assertThrows(CrowdinApiException.class, () -> jsonTransformer.parse(json, clazz));
    }

}