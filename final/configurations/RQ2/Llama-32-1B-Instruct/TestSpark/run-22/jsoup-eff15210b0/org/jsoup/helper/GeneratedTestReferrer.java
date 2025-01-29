package org.jsoup.helper;

public class GeneratedTestReferrer {

    @Test
    public void testReferrer() throws MalformedURLException, UnknownHostException {
        HttpConnection connection = JsoupHelper.connect("https://example.com", " referrals-to-redirect.html#some-string");
        assertEquals(connection.referrer("referrals-to-redirect.html#some-string"), "referrals-to-redirect.html#some-string");
    }

}