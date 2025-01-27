package com.crowdin.client.core.http.impl.json;

public class GeneratedParseLanguageTranslationsJsonToLanguageTranslations_WhenJsonIsCorrectThenSuccess {

    private JacksonJsonTransformer transformer;

    @Before
    public void setUp() {
        this.transformer = new JacksonJsonTransformer();
    }

    @Test
    public void parseLanguageTranslationsJsonToLanguageTranslations_WhenJsonIsCorrectThenSuccess() throws CrowdinApiException, HttpBadRequestException, HttpException {
        String json = "{\"project_id\": 1,\"group_ids\":[],\"groups\":[{\"id\":\"123456\",\"name\":\"Group Name\"}]}";
        LanguageTranslations languageTranslations = (LanguageTranslations) transformer.parse(json, LanguageTranslations.class);
        assertNotNull(languageTranslations);
    }

}