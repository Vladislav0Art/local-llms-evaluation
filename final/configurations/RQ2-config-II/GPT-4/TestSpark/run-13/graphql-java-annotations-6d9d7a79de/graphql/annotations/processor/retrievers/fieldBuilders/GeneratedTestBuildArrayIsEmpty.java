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

public class GeneratedTestBuildArrayIsEmpty {

    @Test
    public void testBuildArrayIsEmpty() throws Exception {
        Method method = Service.class.getMethod("toString");
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(method, container);

        GraphQLDirective[] result = directivesBuilder.build();
        assertNotNull(result);
    }

}