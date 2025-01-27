package org.jsoup.nodes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.jsoup.nodes.Document;

public class GeneratedTest {

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

public class Parser {
    public static Document createDoc() {
        return new Doc();
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.jsoup.nodes.Document;

public class DocumentCreationTest {

    private Document document;
    private CreatedDoc createdDoc;

    @BeforeEach
    public void setUp() {
        // Arrange
        when(Document.parser()).thenReturn(new Parser().createDoc());
    }

}