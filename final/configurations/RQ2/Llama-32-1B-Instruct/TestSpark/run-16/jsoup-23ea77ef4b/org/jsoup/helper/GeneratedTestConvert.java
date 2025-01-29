package org.jsoup.helper;

public class GeneratedTestConvert {

    private org.jsoup.nodes.Document document;
    private Element element;

    public boolean namespaceAware() {
        return false;
    }

    public W3CDom namespaceAware(boolean namespaceAware) {
        return new W3CDom(namespaceAware);
    }

    public Document convert(org.jsoup.nodes.Document in) {
        String documentString = in.outerHtml();
        try {
            document = (org.jsoup.nodes.Document) classLoader.loadClass("jsoup.Document").newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        elementDocument = (Element) classLoader.loadClass("jsoup.helper.Element").newInstance();
        document.setDocumentHandler(new DocumentHandler());
        document.parse(documentString);
        return document;
    }

    @Test
    public void testConvert() {
        org.jsoup.nodes.Document doc = convert(org.jsoup.nodes.Document.createTag("html")));
        String html = doc.html();
        System.out.println(html);
        String documentString = convert(doc).outerHtml();
        System.out.println(documentString);
    }

    private class DocumentHandler implements org.jsoup.parser.Parser {

        @Override
        public void startElement(String tag, org.jsoup.tag.TagContext context) {
            if (tag.equals("html")) {
                elementDocument = context ElementTag().newElement(context document());
            } else {
                String textContent = context.getTextContent();
                System.out.println(tag + " : " + textContent);
            }
        }

        @Override
        public void endElement(String tag, org.jsoup.tag.TagContext context) {

        }
    }

}