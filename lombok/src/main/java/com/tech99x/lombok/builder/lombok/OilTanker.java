package com.tech99x.lombok.builder.lombok;

import com.tech99x.lombok.builder.Status;
import com.tech99x.lombok.builder.Voyage;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
public class OilTanker {

    private String name;
    private String registration;
    private LocalDateTime deployedDate;
    private Status status;
    private List<Voyage> voyages;

}
