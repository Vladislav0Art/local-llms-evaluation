package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedTest {

    @Test
    public void DirectivesBuilderConstructorTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(Field.class, container);
        Assert.assertNotNull(directivesBuilder);
    }

    @Test
    public void buildWithNullElementTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(null, container);
        GraphQLDirective[] result = directivesBuilder.build();
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void buildWithNonNullElementAndNullAnnotationsTest() throws Exception {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(Field.class, container);
        directivesBuilder.build();
    }

    @Test
    public void buildWithValidAnnotationsTest() throws Exception {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(Field.class, container);
        GraphQLDirective[] result = directivesBuilder.build();
        Assert.assertNotNull(result);
    }

}