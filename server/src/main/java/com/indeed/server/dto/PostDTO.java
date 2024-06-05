package com.indeed.server.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {

    private String profile;
    private String type;
    private String description;
    private String experience;
    private String technology[];
    private String salary;


}
