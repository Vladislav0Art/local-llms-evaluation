package com.crowdin.client.core.http.impl.json;

public class GeneratedConvertInvalidProjectToJsonTest {

    private JacksonJsonTransformer jsonTransformer;

    @Before
    public void setUp() {
        jsonTransformer = new JacksonJsonTransformer();
    }

    @Test
    public void convertInvalidProjectToJsonTest() {
        Project project = null;
        String result = jsonTransformer.convert(project);
        assertThrows(HttpException.class, () -> result);
    }

}