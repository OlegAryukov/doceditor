package ru.aryukov.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dev on 01.11.17.
 */
@Data
@Entity
public class Template {

    @Id
    @GeneratedValue
    private Long id;

    private ArrayList<Feild> fieldList;

}
