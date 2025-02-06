package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void createShellWithValidBaseUri_ReturnsDocument() {
        // Arrange
        String baseUri = "https://example.com";
        Document expected = new Document(baseUri);

        // Act
        Document actual = Document.createShell(baseUri);

        // Assert
        assertThat(actual, is(expected));
    }

    @Test
    public void createShellWithInvalidBaseUri_ThrowsNullPointerException() {
        // Arrange
        String baseUri = null;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> Document.createShell(baseUri));
    }

    @Test
    public void location_ReturnsLocationString() {
        // Arrange
        Document document = new Document("https://example.com");

        // Act
        String location = document.location();

        // Assert
        assertThat(location, is("https://example.com"));
    }

    @Test
    public void connection_ReturnsConnectionObject() {
        // Arrange
        Connection connection = Jsoup.connect("https://example.com");
        Document document = new Document(connection);

        // Act
        Connection actual = document.connection();

        // Assert
        assertThat(actual, is(connection));
    }

    @Test
    public void documentType_ReturnsDocumentTypeObject() {
        // Arrange
        DocumentType documentType = new DocumentType();
        Document document = new Document(documentType);

        // Act
        DocumentType actual = document.documentType();

        // Assert
        assertThat(actual, is(documentType));
    }

    @Test
    public void head_ReturnsHeadElement() {
        // Arrange
        Tag tag = new Tag("head");
        Element expected = new Head(tag);
        Document document = new Document(expected);

        // Act
        Element actual = document.head();

        // Assert
        assertThat(actual, is(expected));
    }

    @Test
    public void body_ReturnsBodyElement() {
        // Arrange
        Tag tag = new Tag("body");
        Element expected = new Body(tag);
        Document document = new Document(expected);

        // Act
        Element actual = document.body();

        // Assert
        assertThat(actual, is(expected));
    }

    @Test
    public void forms_ReturnsFormsList() {
        // Arrange
        List<FormElement> expected = new ArrayList<>();
        Document document = new Document(expected);

        // Act
        List<FormElement> actual = document.forms();

        // Assert
        assertThat(actual, is(expected));
    }

    @Test
    public void expectForm_RetursExpectedFormElement() {
        // Arrange
        FormElement form = new FormElement();
        Document document = new Document(form);
        String expectedCssQuery = "#my-form";
        Tag tag = new Tag("form", expectedCssQuery);

        // Act
        FormElement actual = document.expectForm(expectedCssQuery);

        // Assert
        assertThat(actual, is(form));
    }

    @Test
    public void title_ReturnsTitleString() {
        // Arrange
        Document document = new Document("https://example.com");

        // Act
        String title = document.title();

        // Assert
        assertThat(title, is(""));
    }

    @Test
    public void createElement_RetursElementWithGivenTagName() {
        // Arrange
        String tagName = "div";
        Element expected = new Div(tagName);

        // Act
        Element actual = document.createElement(tagName);

        // Assert
        assertThat(actual, is(expected));
    }

    @Test
    public void outerHtml_ReturnsOuterHTMLString() {
        // Arrange
        Document document = new Document("https://example.com");

        // Act
        String outerHtml = document.outerHtml();

        // Assert
        assertThat(outerHtml, is(""));
    }

    @Test
    public void text_RetursTextString() {
        // Arrange
        Document document = new Document("https://example.com");

        // Act
        String text = document.text("Hello World");

        // Assert
        assertThat(text, is(""));
    }

    @Test
    public void nodeName_ReturnsNodeNameString() {
        // Arrange
        Document document = new Document("https://example.com");

        // Act
        String nodeName = document.nodeName();

        // Assert
        assertThat(nodeName, is(""));
    }

    @Test
    public void charset_ReturnsCharsetObject() {
        // Arrange
        Charset charset = DataUtil.UTF_8;
        Document document = new Document(charset);

        // Act
        Charset actual = document.charset();

        // Assert
        assertThat(actual, is(charset));
    }

    @Test
    public void updateMetaCharsetElement_ReturnsBooleanValue() {
        // Arrange
        boolean update = true;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> document.updateMetaCharsetElement());
    }

}