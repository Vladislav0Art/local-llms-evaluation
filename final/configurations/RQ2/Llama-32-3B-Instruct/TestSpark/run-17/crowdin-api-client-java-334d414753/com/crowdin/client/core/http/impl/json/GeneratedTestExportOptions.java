package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class GeneratedTestExportOptions {


}

package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;
import java.util.Optional;

public class GeneratedTest {

    @Test
    public void testExportOptions() {
        ExportOptions options = new ExportOptions();
        CrowdinJsonConverter converter = (jsonNode, obj) -> ((ExportOptions) obj).setFormat(jsonNode.get("format").asText());
        converter.convert(new JsonNode.ObjectNode(), options);
        assert options.getFormat().equals("pdf");
    }

    public static class ExportOptions {
        private String format;

        public void setFormat(String format) {
            this.format = format;
        }

        public String getFormat() {
            return format;
        }
    }

}