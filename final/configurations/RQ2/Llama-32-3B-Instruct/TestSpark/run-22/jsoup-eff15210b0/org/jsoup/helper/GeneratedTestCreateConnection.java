package org.jsoup.helper;

public class GeneratedTestCreateConnection {

    private boolean followRedirects;
    private String referrer;
    private int maxBodySize;
    private int postDataCharset;

    public void setFollowRedirects(boolean followRedirects) {
        this.followRedirects = followRedirects;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public void setMaxBodySize(int maxBodySize) {
        this.maxBodySize = maxBodySize;
    }

    public void setPostDataCharset(String postDataCharset) {
        this.postDataCharset = postDataCharset;
    }

    public boolean isFollowRedirects() {
        return followRedirects;
    }

    public String getReferrer() {
        return referrer;
    }

    public int getMaxBodySize() {
        return maxBodySize;
    }

    public String getPostDataCharset() {
        return postDataCharset;
    }
}

public class TestHttpConnection {

    @Test
    public void testCreateConnection() {
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection);
    }

}