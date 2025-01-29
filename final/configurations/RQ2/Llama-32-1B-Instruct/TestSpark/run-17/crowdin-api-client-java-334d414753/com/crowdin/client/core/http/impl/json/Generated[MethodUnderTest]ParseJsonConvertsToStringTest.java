package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class Generated[MethodUnderTest]

ParseJsonConvertsToStringTest {

    public ObjectMapper objectMapper = new ObjectMapper();
    public Project project;
    public FileInfo fileInfo;
    public ImportOptions importOptions;

    @Before
    public void setup () {
        objectMapper.registerModule(new SimpleModule());
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        objectMapper.enable(DeserializationFeature.FAIL_ON_missing_dates);

        project = new Project();
        fileInfo = new FileInfo();
        importOptions = new ImportOptions();

        // Mocking not used in this test
    }

    @Test
    public void [MethodUnderTest]ParseJsonConvertsToStringTest() throws Exception {
        String json = "[\"string\"]";
        Class<?> clazz = String.class;

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object actual = transformer.parse(json, clazz);
        assertEquals("string", transformer.convert(actual));
    }

}