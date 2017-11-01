package ru.aryukov.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by dev on 01.11.17.
 */
@Data
@Entity
public class Feild {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String type;


}
