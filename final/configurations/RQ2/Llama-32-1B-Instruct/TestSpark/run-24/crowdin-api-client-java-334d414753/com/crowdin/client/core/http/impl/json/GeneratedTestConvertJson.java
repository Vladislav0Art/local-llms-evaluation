package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertJson {

    @Test
    public void testConvertJson() throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = "2022-01-01";
        String json = "{\"date\":\"" + date + "\"}";

        String convertedDate = JacksonJsonTransformer.convert(date, Date.class);
        assertEquals(date, convertedDate);
    }

}