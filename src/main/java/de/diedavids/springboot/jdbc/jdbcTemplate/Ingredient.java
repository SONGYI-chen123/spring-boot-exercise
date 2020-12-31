package de.diedavids.springboot.jdbc.jdbcTemplate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Getter
@Setter
@SuperBuilder
@Table(name = "ingredient")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {
    private String name;
    private String id;
    private Type type;

    public enum Type {
        TYPE1("类型1");
        String value;

        Type(String value) {
            this.value = value;
        }
    }
}

