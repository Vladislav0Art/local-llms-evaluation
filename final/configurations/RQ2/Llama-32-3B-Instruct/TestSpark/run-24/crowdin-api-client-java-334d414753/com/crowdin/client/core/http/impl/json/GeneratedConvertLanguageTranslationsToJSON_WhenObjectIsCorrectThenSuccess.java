package com.crowdin.client.core.http.impl.json;

public class GeneratedConvertLanguageTranslationsToJSON_WhenObjectIsCorrectThenSuccess {

    private JacksonJsonTransformer transformer;

    @Before
    public void setUp() {
        this.transformer = new JacksonJsonTransformer();
    }

    @Test
    public void convertLanguageTranslationsToJSON_WhenObjectIsCorrectThenSuccess() throws CrowdinApiException, HttpBadRequestException, HttpException {
        LanguageTranslations languageTranslations = new LanguageTranslations(1, Arrays.asList(), Arrays.asList());
        String json = transformer.convert(languageTranslations);
        assertEquals("{\"project_id\": 1,\"group_ids\": [],\"groups\": [\"123456\",\"Group Name\"]}", json);
    }

}