package com.crowdin.client.core.http.impl.json;

public class GeneratedTest {

    @Test
    public void TestParseJsonStringToString() throws Exception {
        String jsonStr = "{\"name\":\"test\",\"id\":123}";
        String result = new JacksonJsonTransformer().parse(jsonStr, String.class);
        assertEquals("test", result);
    }

    @Test
    public void TestConvertObjectToJsonString() throws Exception {
        Project project = new Project();
        project.setDisplayName("Test Project");
        project.setId(123);
        String expectedJson = "{\"name\":\"Test Project\",\"id\":123}";
        String actualJson = new JacksonJsonTransformer().convert(project);
        assertEquals(expectedJson, actualJson);
    }

    @Test
    public void TestParseJsonStringToObject() throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String jsonStr2 = "{\"name\":\"test\",\"date\":\"2022-01-01\"}";
        Date date = dateFormat.parse(jsonStr2);
        Project project2 = new JacksonJsonTransformer().parse(date, Project.class);
        assertEquals(project2, new Project());
    }

    @Test
    public void TestConvertObjectToSimpleDateFormat() throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String expectedJson = "{\"name\":\"test\",\"date\":\"2022-01-01\"}";
        String actualJson = new JacksonJsonTransformer().convert(new Project());
        assertEquals(expectedJson, actualJson);
    }
}

class TestJacksonJsonTransformer {
    @Override
    public <T> T parse(String json, Class<T> clazz) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, clazz);
    }

    @Override
    public <T> String convert(T obj) throws Exception {
        return mapper.writeValueAsString(obj);
    }

}