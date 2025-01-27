package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class GeneratedTestCrowdin {


}

package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;
import java.util.Optional;

public class GeneratedTest {

    @Test
    public void testCrowdin() {
        String json = "{\"name\": \"test-project\"}";
        Project project = JacksonJsonTransformer.parse(json, Project.class);
        assert project.getName().equals("test-project");
    }

    public static class Project {
        private String name;

        public String getName() {
            return name;
        }
    }

}