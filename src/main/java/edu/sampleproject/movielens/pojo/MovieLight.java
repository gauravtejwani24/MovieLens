package edu.sampleproject.movielens.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieLight {
    private String id;
    private String name;
    private String shortDesc;
}

