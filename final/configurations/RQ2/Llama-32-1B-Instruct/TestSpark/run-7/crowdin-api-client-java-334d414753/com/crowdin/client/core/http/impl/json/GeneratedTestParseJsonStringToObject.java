package com.crowdin.client.core.http.impl.json;

public class GeneratedTestParseJsonStringToObject {

    @Test
    public void TestParseJsonStringToObject() throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String jsonStr2 = "{\"name\":\"test\",\"date\":\"2022-01-01\"}";
        Date date = dateFormat.parse(jsonStr2);
        Project project2 = new JacksonJsonTransformer().parse(date, Project.class);
        assertEquals(project2, new Project());
    }

}