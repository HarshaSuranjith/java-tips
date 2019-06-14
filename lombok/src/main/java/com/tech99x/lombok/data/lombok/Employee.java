package com.tech99x.lombok.data.lombok;

import lombok.*;

import java.time.LocalDate;

@Data(staticConstructor = "of")
public class Employee {

    private @NonNull String firstName;
    private @NonNull String lastName;
    private @NonNull String address;
    private @NonNull LocalDate dateOfBirth;

    @Setter(AccessLevel.PROTECTED)
    private @NonNull String epfNo;
    private @NonNull String designation;

}
