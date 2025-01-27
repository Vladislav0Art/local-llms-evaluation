package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.jsoup.nodes.Document;
import org.mockito.Mockito;

public class GeneratedTestParse {

    private Location location;

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getUrl() {
        return location.getUrl();
    }

    public String getText() {
        return "newText";
    }
}

public class CreatedDoc {
    private Document createdDoc;

    public CreatedDoc(Document doc) {
        this.createdDoc = doc;
    }
}

public class Location {
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

public class DocumentCreationTest {
    @Before
    public void setUp() {
        // Arrange
        when(Document.parser()).thenReturn(new Parser());
        createdDoc = new Doc();
    }

    @Test
    public void testParse() {
        // Act
        createdDoc = DocParser.createDoc();

        // Assert
        assertNotNull(createdDoc);
    }

}