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
public class DocumentFieldValue {

    @Id
    @GeneratedValue
    private Long id;

    private Long docId;

    private Long templateFieldId;

    private String value;
}
