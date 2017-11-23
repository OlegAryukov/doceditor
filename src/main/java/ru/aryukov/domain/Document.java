package ru.aryukov.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

/**
 * Created by dev on 23.11.17.
 */
@Data
@Entity
public class Document {

    @Id
    @GeneratedValue
    private Long id;

    private Long templateId;
    private ArrayList<DocumentFieldValue> docValues;

}
