package com.tech99x.lombok.getters_setters;


import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class EmployeeLombok {

    private String firstName;
    private String lastName;
    private String address;
    private LocalDate dateOfBirth;

    @Setter(AccessLevel.PROTECTED)
    private String epfNo;
    private String designation;

}
