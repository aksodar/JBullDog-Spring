package ru.gb.jbulldog.jbulldogspring.data;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Task {
    private long taskId;
    private String message;
}
