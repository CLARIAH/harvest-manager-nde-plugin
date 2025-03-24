package nl.knaw.huc.di.sd;

import nl.mpi.oai.harvester.Provider;
import nl.mpi.oai.harvester.control.Configuration;
import nl.mpi.oai.harvester.cycle.Cycle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class NdeProtocolTest {

    private NdeProtocol ndeProtocol;
    private Provider provider;
    private Configuration config;
    private Cycle cycle;

    @BeforeEach
    void setUp() {
        provider = Mockito.mock(Provider.class);
        config = Mockito.mock(Configuration.class);
        cycle = Mockito.mock(Cycle.class);
        ndeProtocol = new NdeProtocol(provider, config, cycle);
    }

    @Test
    void testRun() {
        // Add code to set up the necessary conditions for the test
        // ...

        ndeProtocol.run();
        // Add assertions to verify the expected behavior
        // ...
    }

//    @Test
//    void testConstructor() {
//        assertNotNull(ndeProtocol);
//        assertEquals(provider, ndeProtocol.getProvider());
//        assertEquals(config, ndeProtocol.getConfig());
//        assertEquals(cycle, ndeProtocol.getCycle());
//    }
}