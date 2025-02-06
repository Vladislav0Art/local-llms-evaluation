package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void location() {
        Document document = new Document("http://example.com");
        assertThat(document.location(), is("http://example.com"));
    }

    @Test
    public void location() {
        Document document = new Document();
        assertThat(document.location(), null);
    }

    @Test
    public void connection() {
        Connection connection = Mockito.mock(Connection.class);
        Document document = new Document("http://example.com");
        document.connection(connection);
        assertThat(document.connection(), is(connection));
    }

    @Test
    public void connection() {
        Document document = new Document();
        assert document.connection() == null;
    }

    @Test
    public void head() {
        Document document = new Document("http://example.com");
        Element head = document.head();
        assertThat(head, is(document));
    }

    @Test
    public void head() {
        Document document = new Document();
        assert document.head() == null;
    }

    @Test
    public void body() {
        Document document = new Document("http://example.com");
        Element body = document.body();
        assertThat(body, is(document));
    }

    @Test
    public void body() {
        Document document = new Document();
        assert document.body() == null;
    }

    @Test
    public void forms() {
        List<FormElement> forms = new ArrayList<>();
        Document document = new Document("http://example.com", forms);
        FormElement form = document.forms().get(0);
        assertThat(form, is(forms.get(0)));
    }

    @Test
    public void forms() {
        List<FormElement> forms = new ArrayList<>();
        assert document.forms() == null;
    }

    @Test
    public void expectForm() {
        Document document = new Document("http://example.com");
        FormElement form = document.expectForm("form");
        assertThat(form, is(document));
    }

    @Test
    public void expectForm() {
        Document document = new Document();
        assert document.expectForm("form") == null;
    }

    @Test
    public void title() {
        Document document = new Document("http://example.com");
        String title = document.title();
        assertThat(title, is(""));
    }

    @Test
    public void title() {
        Document document = new Document();
        assert document.title() == null;
    }

    @Test
    public void title() {
        Document document = new Document("http://example.com");
        document.title("New Title");
        String title = document.title();
        assertThat(title, is("New Title"));
    }

    @Test
    public void createElement() {
        Element element = document.createElement("div");
        assertThat(element.tagName(), is("div"));
    }

    @Test
    public void createElement() {
        assert document.createElement("div") == null;
    }

    @Test
    public void outerHtml() {
        Document document = new Document("http://example.com");
        String html = document.outerHtml();
        assertThat(html, is(""));
    }

    @Test
    public void outerHtml() {
        assert document.outerHtml() == null;
    }

}