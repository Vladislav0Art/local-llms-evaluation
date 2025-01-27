package com.crowdin.client.core.http.impl.json;

public class GeneratedConvertValidProjectToJsonTest {

    private JacksonJsonTransformer jsonTransformer;

    @Before
    public void setUp() {
        jsonTransformer = new JacksonJsonTransformer();
    }

    @Test
    public void convertValidProjectToJsonTest() {
        Project project = new Project("id", "name");
        String result = jsonTransformer.convert(project);
        ObjectMapperMapper.mapFromString(result).equals(ObjectMapperMapper.mapToString(project));
    }

}