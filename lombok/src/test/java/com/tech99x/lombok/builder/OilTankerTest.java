package com.tech99x.lombok.builder;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;

public class OilTankerTest {

    @Test
    public void testBuilder() {

        OilTanker.OilTankerBuilder builder = OilTanker.builder();

        builder
                .name("HMS Titan")
                .registration("XV001")
                .status(Status.HARBOUR)
                .deployedDate(LocalDateTime.of(2000, 4, 15, 0, 0));

        List<Voyage> voyages = new ArrayList<>();
        voyages.add(new Voyage());
        builder.voyages(voyages);

        OilTanker hmsTitan = builder.build();


        assertThat(hmsTitan.getName(), is("HMS Titan"));
        assertThat(hmsTitan.getDeployedDate(), is(LocalDateTime.of(2000,4,15,0,0)));
        assertThat(hmsTitan.getStatus(), is(Status.HARBOUR));
        assertThat(hmsTitan.getRegistration(), is("XV001"));
        assertThat(hmsTitan.getVoyages(), hasSize(1));
    }

}
