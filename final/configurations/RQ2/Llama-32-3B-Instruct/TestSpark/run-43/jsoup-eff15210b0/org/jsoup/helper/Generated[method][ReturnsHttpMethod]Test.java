package org.jsoup.helper;

public class Generated[method][ReturnsHttpMethod]

Test {

    @Test
    public void [method][ReturnsHttpMethod]Test() {
        Method method = Method.GET;
        Connection connection = HttpConnection.method(method);
        Assert.assertEquals(method, connection.method());
    }

}