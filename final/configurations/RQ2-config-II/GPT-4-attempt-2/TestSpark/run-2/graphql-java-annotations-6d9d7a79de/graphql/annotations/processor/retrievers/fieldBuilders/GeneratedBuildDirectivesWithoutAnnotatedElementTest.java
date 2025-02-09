package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLEnumType;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Field;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;

@RunWith(PowerMockRunner.class)
public class GeneratedBuildDirectivesWithoutAnnotatedElementTest {

    DirectivesBuilder .class
})

public class DirectivesBuilderTest {

    @Test
    public void buildDirectivesWithoutAnnotatedElementTest() throws Exception {
        //Arrange
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(null, container);

        //Act
        GraphQLDirective[] result = directivesBuilder.build();

        //Assert
        assertNull(result);
    }

}