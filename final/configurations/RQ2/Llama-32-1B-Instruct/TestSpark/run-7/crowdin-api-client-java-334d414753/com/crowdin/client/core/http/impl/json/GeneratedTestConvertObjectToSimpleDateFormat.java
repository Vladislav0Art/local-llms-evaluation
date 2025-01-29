package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertObjectToSimpleDateFormat {

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