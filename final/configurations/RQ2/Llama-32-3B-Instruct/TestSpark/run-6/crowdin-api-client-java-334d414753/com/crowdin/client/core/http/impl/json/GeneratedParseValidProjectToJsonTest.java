package com.crowdin.client.core.http.impl.json;

public class GeneratedParseValidProjectToJsonTest {

    private JacksonJsonTransformer jsonTransformer;

    @Before
    public void setUp() {
        jsonTransformer = new JacksonJsonTransformer();
    }

    @Test
    public void parseValidProjectToJsonTest() {
        Project project = new Project("id", "name");
        String json = ObjectMapperMapper.mapToString(project);
        Class<Project> clazz = Project.class;
        Object result = jsonTransformer.parse(json, clazz);
        assertEquals(project, result);
    }

}