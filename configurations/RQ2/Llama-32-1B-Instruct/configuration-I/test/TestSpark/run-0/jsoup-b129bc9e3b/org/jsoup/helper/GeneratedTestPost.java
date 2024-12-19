package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPost {

    @Test
    public void testPost() {
        // Create an empty POST request body
        String dataKeyval = "keyval";
        Document document = new PublicClass();

        // Set up the POST method with a null value
        Request request = new PublicMethod(document);
        assertEquals(200, request.post(dataKeyval).execute());
    }
}

class PublicClass {
    public String getDoc() {
        return "Hello, World!";
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }
}

class PublicMethod {
    private Document document;

    public Request post(String dataKeyval) throws Exception {
        // Set up the POST request with a null value
        Request request = new PostRequest(document);
        return request.post(dataKeyval);
    }

    public void execute() {
        assertEquals(200, this.request.getResponseCode());
    }
}

class PublicRequest {
    private Document document;

    public Request setDocument(Document document) throws Exception {
        this.document = document;
        return this;
    }

    public Response post(String dataKeyval) {
        // Create a new response with the provided data
        Response response = new Response(document);
        response.setData(dataKeyval);
        return response;
    }

    public int getResponseCode() {
        return 200;
    }
}

class PostRequest extends Request {
    private Document document;

    public PostRequest(Document document) throws Exception {
        this.document = document;
    }

    @Override
    public Response post(String dataKeyval) throws Exception {
        // Create a new response with the provided data
        Response response = new Response(document);
        response.setData(dataKeyval);
        return response;
    }

}