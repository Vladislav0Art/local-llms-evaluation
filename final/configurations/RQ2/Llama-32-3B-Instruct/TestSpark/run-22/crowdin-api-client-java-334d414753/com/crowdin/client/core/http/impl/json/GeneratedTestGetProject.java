package com.crowdin.client.core.http.impl.json;

public class GeneratedTestGetProject {

    public long id;
    public String name;

    public Project(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return id == project.id &&
                Objects.equals(name, project.name);
    }
}

public class CrowdinApiClient {

    private String projectName;

    public CrowdinApiClient(String projectName) {
        this.projectName = projectName;
    }

    public String getProject() throws Exception {
        // Implementation to fetch the project
        throw new Exception("Not implemented");
    }

    public String addProject() throws Exception {
        // Implementation to create a new project
        throw new Exception("Not implemented");
    }
}

public class CrowdinApiException extends Exception {

}

public class CrowdinApiTest {

    @Test
    public void testGetProject() {
        // Given
        Project project = new Project(1L, "Crowdin");

        // When
        CrowdinApiClient crowdinClient = new CrowdinApiClient("Crowdin");
        String response = crowdinClient.getProject();

        // Then
        assertEquals("Project-123", response);
    }

}