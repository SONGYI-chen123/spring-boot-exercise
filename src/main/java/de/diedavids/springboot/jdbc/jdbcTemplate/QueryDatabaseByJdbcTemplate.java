package de.diedavids.springboot.jdbc.jdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryDatabaseByJdbcTemplate {
    private JdbcTemplate jdbc;

    public Ingredient findOne(String id) {
        return jdbc.queryForObject("select id,name,type from Ingredient where id=?", this::mapRowToIngredient, id);
    }

    private Ingredient mapRowToIngredient(ResultSet rs, int i) throws SQLException {
            return new Ingredient(
                    rs.getString("id"),
                    rs.getString("name"),
                    Ingredient.Type.valueOf(rs.getString("type"))
            );
        }
}
