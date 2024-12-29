package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import graphql.annotations.processor.ProcessingElementsContainer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.AnnotatedElement;

public class GeneratedTest {

    @Test
    public void buildDirectivesBuilderTest() {
        AnnotatedElement annotatedElement = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, container);

        GraphQLDirective[] directives = directivesBuilder.build();

        Assert.assertNotNull(directives);
    }

    @Test
    public void buildWithNullObjectTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(null, container);

        directivesBuilder.build();
    }

    @Test
    public void buildWithNullContainerTest() {
        AnnotatedElement annotatedElement = Mockito.mock(AnnotatedElement.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, null);

        directivesBuilder.build();
    }

    @Test
    public void buildWithInvalidObjectTest() {
        AnnotatedElement invalidElement = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(invalidElement, container);

        directivesBuilder.build();
    }

}