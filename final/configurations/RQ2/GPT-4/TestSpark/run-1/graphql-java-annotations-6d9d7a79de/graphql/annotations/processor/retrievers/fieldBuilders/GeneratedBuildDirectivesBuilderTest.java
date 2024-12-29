package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import graphql.annotations.processor.ProcessingElementsContainer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.AnnotatedElement;

public class GeneratedBuildDirectivesBuilderTest {

    @Test
    public void buildDirectivesBuilderTest() {
        AnnotatedElement annotatedElement = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, container);

        GraphQLDirective[] directives = directivesBuilder.build();

        Assert.assertNotNull(directives);
    }

}