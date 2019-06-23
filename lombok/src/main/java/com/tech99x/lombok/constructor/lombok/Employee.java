package com.tech99x.lombok.constructor.lombok;

import lombok.*;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@RequiredArgsConstructor(staticName = "of")
public class Employee {

    private @NonNull String firstName;
    private @NonNull String lastName;
    private String address;
    private @NonNull LocalDate dateOfBirth;
    private @NonNull String epfNo;
    private @NonNull String designation;

}

