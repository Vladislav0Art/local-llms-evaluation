package org.jsoup.nodes;

public class GeneratedTestNewRequest {

    @Test
    public void testNewRequest() {
        //Arrange
        Connection connection = new Connection();

        //Act
        Connection request = connection.newRequest();

        //Assert
        assertNotNull(request);
    }

}