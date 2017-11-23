package ru.aryukov.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by dev on 23.11.17.
 */

@Data
@Entity
public class TemplateFields {

    @Id
    @GeneratedValue
    private Long id;

    private Long fieldId;

    private Long templateId;

    private Integer order;


}
