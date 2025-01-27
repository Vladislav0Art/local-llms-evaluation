package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class GeneratedTestConvert {


}

package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;
import java.util.Optional;

public class GeneratedTest {

    @Test
    public void testConvert() {
        LanguageTranslations translations = new LanguageTranslations();
        CrowdinJsonConverter converter = (jsonNode, obj) -> ((LanguageTranslations) obj).setLanguage(jsonNode.get("language").asText());
        converter.convert(new JsonNode.ObjectNode(), translations);
        assert translations.getLanguage().equals("en");
    }

    public static class LanguageTranslations {
        private String language;

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getLanguage() {
            return language;
        }
    }

}