package org.jsoup.helper;

public class GeneratedTestPostRequestWithMultipleFiles {

    @Test
    public void testPostRequestWithMultipleFiles() throws Exception {
        HttpConnection connection = new HttpConnection(Request.empty());
        Request request = new Request("POST", "http://example.com");
        List<String> files = new ArrayList<>();
        files.add(new File("file1.txt"));
        files.add(new File("file2.txt"));
        String content = new String(files.stream().mapToObj(file -> file.readAllBytes()).toArray(String[]::new));
        response = connection.post(request, content);
        assert response != null;

        String content = response.getContent();
        System.out.println(content);
    }

}