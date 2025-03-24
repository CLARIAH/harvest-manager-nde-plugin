package nl.knaw.huc.di.sd;

import nl.mpi.oai.harvester.metadata.Metadata;
import nl.mpi.oai.harvester.metadata.Record;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.parsers.ParserConfigurationException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NDESplitActionTest {

    private NDESplitAction ndeSplitAction;

    @BeforeEach
    void setUp() throws ParserConfigurationException {
        ndeSplitAction = new NDESplitAction();
    }

    @Test
    void testPerformWithEmptyRecords() {
        List<Record> records = new ArrayList<>();
        boolean result = ndeSplitAction.perform(records);
        assertTrue(result);
        assertTrue(records.isEmpty());
    }

    @Test
    void testPerformWithValidRecords() {
        // Add code to create and add valid records to the list
        List<Record> records = new ArrayList<>();
        // Add mock records to the list
        // ...

        boolean result = ndeSplitAction.perform(records);
        assertTrue(result);
        // Add assertions to verify the expected behavior
        // ...
    }

    @Test
    void testPerformWithInvalidRecords() {
        // Add code to create and add invalid records to the list
        List<Record> records = new ArrayList<>();
        // Add mock invalid records to the list
        // ...

        boolean result = ndeSplitAction.perform(records);
        assertTrue(result);
        // Add assertions to verify the expected behavior
        // ...
    }
}