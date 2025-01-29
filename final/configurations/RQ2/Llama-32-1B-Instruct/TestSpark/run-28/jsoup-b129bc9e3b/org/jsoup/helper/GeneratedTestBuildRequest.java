package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;

import javax.annotation.Nullable;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

import static org.jsoup.Connection.Method.HEAD;
import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedTestBuildRequest {

    public String buildRequest(Method method, Connection.Request request) {
        return method.make().url(request.url());
    }

    @Override
    public Connection data(String key, Map<String, String> data) {
        Document doc = new Document();
        for (Map.Entry<String, String> entry : data.entrySet()) {
            doc.appendTag(entry.getKey(), entry.getValue());
        }
        return document(doc);
    }

    private static class Response implements Connection.Response {
        private final Connection.Response response;

        public Response(Connection.Response response) {
            this.response = response;
        }

        @Override
        public InputStream getInputStream() throws IOException {
            return response.getInputStream();
        }

        @Override
        public boolean isSuccessful() {
            return true;
        }
    }

    @Override
    public Connection execute() throws IOException {
        Connection.Request request = new Request();
        try {
            return buildRequest(new Method(), request);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isSuccessful() {
        return true;
    }

    private static class Document implements Connection.Document {
        private final Document document;

        public Document(Document document) {
            this.document = document;
        }

        @Override
        public String toString() {
            return document.toString();
        }
    }

    public static void testConnect(String url) throws IOException {
        HttpConnection connection = new HttpConnection();
        try (InputStream inputStream = connection.connect(url)) {
            Document document = new Document(inputStream);
            System.out.println(document.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testBuildRequest() throws IOException {
        HttpConnection connection = new HttpConnection();
        Request request = new Request();
        try (InputStream inputStream = connection.execute()) {
            Document document = new Document(inputStream);
            System.out.println(document.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}