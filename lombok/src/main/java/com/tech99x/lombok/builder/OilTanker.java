package com.tech99x.lombok.builder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OilTanker {

    private String name;
    private String registration;
    private LocalDateTime deployedDate;
    private Status status;
    private List<Voyage> voyages;

    public OilTanker(String name, String registration, LocalDateTime deployedDate, Status status, List<Voyage> voyages) {
        this.name = name;
        this.registration = registration;
        this.deployedDate = deployedDate;
        this.status = status;
        this.voyages = voyages;
    }

    public static OilTankerBuilder builder() {
        return new OilTankerBuilder();
    }

    public static class OilTankerBuilder {
        private String name;
        private String registration;
        private LocalDateTime deployedDate;
        private Status status;
        private List<Voyage> voyages;

        public OilTankerBuilder() {
        }

        public OilTankerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public OilTankerBuilder registration(String registration) {
            this.registration = registration;
            return this;
        }

        public OilTankerBuilder deployedDate(LocalDateTime deployedDate) {
            this.deployedDate = deployedDate;
            return this;
        }

        public OilTankerBuilder status(Status status) {
            this.status = status;
            return this;
        }

        public OilTankerBuilder voyages(List<Voyage> voyages) {
            if (this.voyages == null) {
                this.voyages = new ArrayList<>();
            }
            this.voyages.addAll(voyages);
            return this;
        }

        public OilTanker build() {
            return new OilTanker(name, registration, deployedDate, status, voyages);
        }
    }

    public String getName() {
        return name;
    }

    public String getRegistration() {
        return registration;
    }

    public LocalDateTime getDeployedDate() {
        return deployedDate;
    }

    public Status getStatus() {
        return status;
    }

    public List<Voyage> getVoyages() {
        return voyages;
    }
}
