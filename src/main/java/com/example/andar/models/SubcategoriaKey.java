package com.example.andar.models;

import java.io.Serializable;

/**
 * SEE https://stackoverflow.com/questions/51423268/spring-jpa-entity-with-two-primary-key
 * Class used to implement multiple @Id columns.
 */
public class SubcategoriaKey implements Serializable{
    private Long id;
    private Long categoria_Id;
}