package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWithNullObjectTest {

    @Mock
    private Method methodMock;

    @InjectMocks
    ProcessingElementsContainer containerMock;

    @Test
    public void buildWithNullObjectTest() {
        DirectivesBuilder builder = new DirectivesBuilder(null, containerMock);
        builder.build();
    }

}