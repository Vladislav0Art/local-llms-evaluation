package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.mockito.Mockito;

import javax.xml.ws.Service;
import java.lang.reflect.Method;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class GeneratedTestBuildThrowsException {

    @Test
    public void testBuildThrowsException() throws Exception {
        Method method = Service.class.getMethod("equals", Object.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        when(container.getDirective(Method.class)).thenThrow(Exception.class);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(method, container);

        directivesBuilder.build();
    }

}