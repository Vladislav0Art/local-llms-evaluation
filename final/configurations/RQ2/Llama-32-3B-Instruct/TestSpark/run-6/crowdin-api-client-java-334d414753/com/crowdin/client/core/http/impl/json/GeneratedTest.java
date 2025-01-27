package com.crowdin.client.core.http.impl.json;

public class GeneratedTest {

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

    @Test
    public void parseInvalidProjectToJsonTest() {
        String json = "{\"invalid\":\"json\"}";
        Class<Project> clazz = Project.class;
        assertThrows(CrowdinApiException.class, () -> jsonTransformer.parse(json, clazz));
    }

    @Test
    public void convertValidProjectToJsonTest() {
        Project project = new Project("id", "name");
        String result = jsonTransformer.convert(project);
        ObjectMapperMapper.mapFromString(result).equals(ObjectMapperMapper.mapToString(project));
    }

    @Test
    public void convertInvalidProjectToJsonTest() {
        Project project = null;
        String result = jsonTransformer.convert(project);
        assertThrows(HttpException.class, () -> result);
    }

}