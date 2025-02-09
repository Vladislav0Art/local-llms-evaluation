package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.Builder;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Method;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void buildDefaultConstructorTest() {
        DirectivesBuilder builder = new DirectivesBuilder();
        builder.build();
    }

    @Test
    public void buildNotNullObjectTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Method method = Mockito.mock(Method.class);
        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        GraphQLDirective[] result = builder.build();
        Assert.assertNotNull(result);
    }

    @Test
    public void buildWithDirectivesTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Method method = Mockito.mock(Method.class);
        when(method.getAnnotations()).thenReturn(new Annotation[]{});
        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        GraphQLDirective[] result = builder.build();
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void buildWithoutDirectivesTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Method method = Mockito.mock(Method.class);
        when(method.getAnnotations()).thenReturn(null);
        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        GraphQLDirective[] result = builder.build();
        Assert.assertEquals(0, result.length);
    }

}